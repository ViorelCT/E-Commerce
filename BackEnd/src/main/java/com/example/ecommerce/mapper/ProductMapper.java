package com.example.ecommerce.mapper;

import com.example.ecommerce.dto.ProductRequest;
import com.example.ecommerce.dto.ProductResponse;
import com.example.ecommerce.model.Product;

public class ProductMapper {

    public static Product toEntity(ProductRequest dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());
        return product;
    }

    public static ProductResponse toResponse(Product product) {

        String priceLabel = product.getPrice() + " RON";

        String categoryName = product.getCategory() != null
                ? product.getCategory().getName()
                : null;

        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                priceLabel,
                product.getStock(),
                categoryName
        );
    }
}