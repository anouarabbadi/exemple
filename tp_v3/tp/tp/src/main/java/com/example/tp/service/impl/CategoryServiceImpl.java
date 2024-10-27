package com.example.tp.service.impl;

import com.example.tp.dto.CategoryDTO;
import com.example.tp.mapper.CategoryMapper;
import com.example.tp.model.Category;
import com.example.tp.repository.CategoryRepository;
import com.example.tp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<CategoryDTO> findAll() {
        return categoryMapper.toCategoryDto(categoryRepository.findAll());
    }

    @Override
    public CategoryDTO findById(int id) {
        Category category = categoryRepository.findById(id).orElse(null);
        return category != null ? categoryMapper.toDTO(category) : null;
    }

    @Override
    public void save(CategoryDTO categoryDTO) {
        Category category = categoryMapper.toEntity(categoryDTO);
        categoryRepository.save(category);
    }

    @Override
    public void update(CategoryDTO categoryDTO) {
        Category category = categoryRepository.findById(categoryDTO.getId()).orElse(null);
        if (category != null) {
            category = categoryMapper.update(categoryDTO, category);
            categoryRepository.save(category);
        }
    }

    @Override
    public void deleteById(int id) {
        categoryRepository.deleteById(id);
    }
}