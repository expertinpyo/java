package com.example.springboot.data.dto;


import lombok.*;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

    @NotNull
    String productId;

    @NotNull
    String productName;

    @NotNull
    @Min(value = 500)
    @Max(value=3000000)
    Integer productPrice;

    @NotNull
    @Min(value = 0)
    @Max(value=9999)
    Integer productStock;
}
