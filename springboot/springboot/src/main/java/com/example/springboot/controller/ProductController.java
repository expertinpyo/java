package com.example.springboot.controller;

import com.example.springboot.data.dto.ProductDto;
import com.example.springboot.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/product-api")
public class ProductController {

    private ProductService productService;

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);


    // 생성자에 의한 의존성 주입
    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping(value="/product/{productId}")
    public ProductDto getProduct(@PathVariable String productId){


        ProductDto productDto = productService.getProduct(productId);
        long startTime = System.currentTimeMillis();
        LOGGER.info("[ProductController] perform {} of Inpyo", "getProduct");
        LOGGER.info("[Productcontroller] Response :: productId = {} / productName = {} / productPrice = {} / productStock = {}, ResponseTime ={}ms", productDto.getProductId(),
                productDto.getProductName(), productDto.getProductPrice(), productDto.getProductStock(), System.currentTimeMillis()-startTime);
        return productDto;

    }

    @PostMapping(value="/product")
    public ProductDto createProduct(@Valid @RequestBody ProductDto productDto){


        String productId = productDto.getProductId();
        String productName = productDto.getProductName();
        int productPrice = productDto.getProductPrice();
        int productStock =  productDto.getProductStock();

        return productService.saveProduct(productId, productName, productPrice, productStock);
    }

    @DeleteMapping(value="/product/{productId}")
    public ProductDto deleteProduct(@PathVariable String productId){
        return null;
    }

}

