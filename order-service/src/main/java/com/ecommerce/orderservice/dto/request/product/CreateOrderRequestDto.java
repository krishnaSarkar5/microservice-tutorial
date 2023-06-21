package com.ecommerce.orderservice.dto.request.product;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequestDto {

    private String name;

    private String description;

    private String price;
}
