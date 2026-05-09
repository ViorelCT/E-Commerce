package com.example.ecommerce.mapper;

import com.example.ecommerce.dto.CategoryRequest;
import com.example.ecommerce.dto.CategoryResponse;
import com.example.ecommerce.model.Category;

public class CategoryMapper {

    public static Category toEntity(CategoryRequest request) {
        return new Category(null, request.getName());
    }

    public static CategoryResponse toResponse(Category category) {
        return new CategoryResponse(
                category.getId(),
                category.getName()
        );
    }
}