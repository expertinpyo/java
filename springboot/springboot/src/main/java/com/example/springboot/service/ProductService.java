package com.example.springboot.service;

import com.example.springboot.data.dto.ProductDto;

public interface ProductService {

    // DB에 저장
    ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);
    // 조회
    ProductDto getProduct(String productId);
}
