package com.example.springboot.data.handler;

import com.example.springboot.data.entity.ProductEntity;

public interface ProductDataHandler {

    ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);
    ProductEntity getProductEntity(String productId);
}
