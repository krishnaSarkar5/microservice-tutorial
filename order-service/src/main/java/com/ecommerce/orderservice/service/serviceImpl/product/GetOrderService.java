package com.ecommerce.orderservice.service.serviceImpl.product;

import com.ecommerce.orderservice.dto.request.product.GetOrderByIdDto;
import com.ecommerce.orderservice.dto.response.ResponseDto;
import com.ecommerce.orderservice.entity.Order;
import com.ecommerce.orderservice.service.daoservice.OrderDaoService;

import com.ecommerce.orderservice.utility.ResponseUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GetOrderService {

    private final OrderDaoService orderDaoService;

    private final ResponseUtil responseUtil;

    public GetOrderService(OrderDaoService orderDaoService, ResponseUtil responseUtil) {
        this.orderDaoService = orderDaoService;
        this.responseUtil = responseUtil;
    }
    
    
    public ResponseDto getOrderById(GetOrderByIdDto request){
        Optional<Order> orderById = orderDaoService.getOrderById(request.getId());
        return responseUtil.getSuccessResponse(orderById.get());
    }


    public ResponseDto getAllOrders(){
        List<Order> allProducts = orderDaoService.getAllOrders();
        return responseUtil.getSuccessResponse(allProducts);
    }
}
