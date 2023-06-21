package com.ecommerce.orderservice.entity;



import com.ecommerce.orderservice.dto.request.product.CreateOrderRequestDto;
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
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String price;


    public Order(CreateOrderRequestDto requestDto){

        this.name= requestDto.getName();
        this.description=requestDto.getDescription();
        this.price=requestDto.getPrice();
    }
}
