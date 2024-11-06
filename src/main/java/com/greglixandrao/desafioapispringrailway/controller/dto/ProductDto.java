package com.greglixandrao.desafioapispringrailway.controller.dto;

import com.greglixandrao.desafioapispringrailway.domain.model.Product;

public record ProductDto(
        Long id,
        String productName,
        String productDescription,
        Double price,
        Integer quantity
) {

    public ProductDto(Product model) {
        this(
                model.getId(),
                model.getProductName(),
                model.getDescription(),
                model.getPrice(),
                model.getStock());
    }

    public Product toModel() {
        Product model = new Product();
        model.setId(this.id);
        model.setProductName(this.productName);
        model.setDescription(this.productDescription);
        model.setPrice(this.price);
        model.setStock(this.quantity);

        return model;
    }

}
