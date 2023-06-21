package com.ecommerce.orderservice.service.serviceImpl.product;


import com.ecommerce.orderservice.dto.request.product.CreateOrderRequestDto;
import com.ecommerce.orderservice.dto.response.ResponseDto;
import com.ecommerce.orderservice.entity.Order;
import com.ecommerce.orderservice.service.daoservice.OrderDaoService;
import com.ecommerce.orderservice.utility.ResponseUtil;
import org.springframework.stereotype.Component;

@Component
public class CreateOrderService {

    private final OrderDaoService orderDaoService;

    private final ResponseUtil responseUtil;


    public CreateOrderService(OrderDaoService orderDaoService, ResponseUtil responseUtil) {
        this.orderDaoService = orderDaoService;
        this.responseUtil=responseUtil;
    }

    public ResponseDto creteOrder(CreateOrderRequestDto request){
        Order product = new Order(request);
        Order savedProduct = orderDaoService.saveOrder(product);

        return responseUtil.getSuccessResponse(savedProduct);
    }
}
