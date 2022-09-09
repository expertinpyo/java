package com.example.springboot.service.impl;


import com.example.springboot.data.dto.ProductDto;
import com.example.springboot.data.entity.ProductEntity;
import com.example.springboot.data.handler.ProductDataHandler;
import com.example.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    ProductDataHandler productDataHandler;

    @Autowired
    public ProductServiceImpl(ProductDataHandler productDataHandler){
        this.productDataHandler = productDataHandler;
    }

    @Override
    public ProductDto saveProduct(String productId, String productName, int productPrice, int productStock){
        // 해당 메서드에 대한 직접적인 구현은 ServiceImpl에 담겨 있다.
        ProductEntity productEntity = productDataHandler.saveProductEntity(productId, productName, productPrice, productStock);

        ProductDto productDto = new ProductDto(productEntity.getProductId(), productEntity.getProductName(),
                productEntity.getProductPrice(), productEntity.getProductStock());

        return productDto;
    }

    public ProductDto getProduct(String productId){
        ProductEntity productEntity = productDataHandler.getProductEntity(productId);

        ProductDto productDto = new ProductDto(productEntity.getProductId(), productEntity.getProductName(),
                productEntity.getProductPrice(), productEntity.getProductStock());

        return productDto;
    }
}
