package com.ecommerce.productservice.entity;


import com.ecommerce.productservice.dto.request.product.CreateProductRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String price;


    public  Product(CreateProductRequestDto requestDto){

        this.name= requestDto.getName();
        this.description=requestDto.getDescription();
        this.price=requestDto.getPrice();
    }
}
