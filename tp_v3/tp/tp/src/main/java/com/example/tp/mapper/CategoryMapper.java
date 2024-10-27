package com.example.tp.mapper;

import com.example.tp.dto.CategoryDTO;
import com.example.tp.model.Category;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryMapper {

    public Category toEntity(CategoryDTO categoryDTO) {
        Category category = new Category();
        category.setId(categoryDTO.getId());
        category.setPromotion(new PromotionMapper().toEntity(categoryDTO.getPromotion()));
        category.setProduits(new ProduitMapper().toProduitEntity(categoryDTO.getProduits()));
        return category;
    }

    public CategoryDTO toDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setPromotion(new PromotionMapper().toDTO(category.getPromotion()));
        categoryDTO.setProduits(new ProduitMapper().toProduitDto(category.getProduits()));
        return categoryDTO;
    }

    public List<Category> toCategoryEntity(List<CategoryDTO> listCategoryDto){
        return listCategoryDto.stream().map(this::toEntity).collect(Collectors.toList());
    }

    public List<CategoryDTO> toCategoryDto(List<Category> listCategory){
        return listCategory.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public Category update(CategoryDTO categoryDTO, Category category){
        // Update category entity with data from categoryDTO
        return category;
    }
}