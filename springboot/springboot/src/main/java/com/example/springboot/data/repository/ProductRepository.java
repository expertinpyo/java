package com.example.springboot.data.repository;

import com.example.springboot.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
    //JpaRepository 사용 시 아무것도 없어도 기본적으로 CRUD를 작성한다는 것을 의미 => @Repository 어노테이션 붙이지 않아도 괜찮음
}
