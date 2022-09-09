package com.example.springboot.data.entity;


import com.example.springboot.data.dto.ProductDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="product")
public class ProductEntity {

    @Id
    String productId;

    String productName;

    Integer productPrice;

    Integer productStock;

}
