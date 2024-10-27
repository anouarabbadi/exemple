package com.example.tp.rest;

import com.example.tp.dto.CategoryDTO;
import com.example.tp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/category")
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(path = "/getall")
    public List<CategoryDTO> getAll() {
        return categoryService.findAll();
    }

    @GetMapping(path = "/get/{id}")
    public CategoryDTO getById(@PathVariable int id) {
        return categoryService.findById(id);
    }

    @PostMapping(path = "/add")
    public void addCategory(@RequestBody CategoryDTO categoryDTO) {
        categoryService.save(categoryDTO);
    }

    @PutMapping(path = "/update")
    public void updateCategory(@RequestBody CategoryDTO categoryDTO) {
        categoryService.update(categoryDTO);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteCategory(@PathVariable int id) {
        categoryService.deleteById(id);
    }
}