package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryDTO;
import com.ecommerce.project.payload.CategoryResponse;

import java.util.List;

public interface CategoryService {
    public CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    public CategoryDTO addCategory(CategoryDTO categoryDTO);
    public CategoryDTO deleteCategory(long categoryId);
    public CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
