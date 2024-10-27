package com.example.tp.service;

import com.example.tp.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> findAll();
    CategoryDTO findById(int id);
    void save(CategoryDTO categoryDTO);
    void update(CategoryDTO categoryDTO);
    void deleteById(int id);
}
