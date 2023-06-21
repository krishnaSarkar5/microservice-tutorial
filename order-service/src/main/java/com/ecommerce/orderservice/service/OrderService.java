package com.ecommerce.orderservice.service;


import com.ecommerce.orderservice.dto.request.product.CreateOrderRequestDto;
import com.ecommerce.orderservice.dto.request.product.GetOrderByIdDto;
import com.ecommerce.orderservice.dto.response.ResponseDto;

public interface OrderService {


    ResponseDto createOrder(CreateOrderRequestDto request);


    ResponseDto getOrder(GetOrderByIdDto request);


    ResponseDto getOrderList();
}
