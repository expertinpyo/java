package com.example.springboot.data.dao;

import com.example.springboot.data.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity);
    ProductEntity getProduct(String productId);

}
