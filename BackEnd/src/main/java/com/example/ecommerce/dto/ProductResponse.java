package com.example.ecommerce.dto;

public class ProductResponse {

    private Long id;
    private String name;
    private double price;
    private String priceLabel;
    private int stock;
    private String categoryName;

    public ProductResponse(Long id, String name, double price, String priceLabel, int stock, String categoryName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.priceLabel = priceLabel;
        this.stock = stock;
        this.categoryName = categoryName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceLabel() {
        return priceLabel;
    }

    public int getStock() {
        return stock;
    }

    public String getCategoryName() {
        return categoryName;
    }
}