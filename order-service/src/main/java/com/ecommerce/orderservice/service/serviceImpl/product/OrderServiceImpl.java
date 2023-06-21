package com.ecommerce.orderservice.service.serviceImpl.product;


import com.ecommerce.orderservice.dto.request.product.CreateOrderRequestDto;
import com.ecommerce.orderservice.dto.request.product.GetOrderByIdDto;
import com.ecommerce.orderservice.dto.response.ResponseDto;
import com.ecommerce.orderservice.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {


    private CreateOrderService createOrderService;

    private GetOrderService getOrderService;

    public OrderServiceImpl(CreateOrderService createOrderService, GetOrderService getOrderService) {
        this.createOrderService = createOrderService;
        this.getOrderService = getOrderService;
    }

    @Override
    public ResponseDto createOrder(CreateOrderRequestDto request) {
        return createOrderService.creteOrder(request);
    }

    @Override
    public ResponseDto getOrder(GetOrderByIdDto request) {
        return getOrderService.getOrderById(request);
    }

    @Override
    public ResponseDto getOrderList() {
        return getOrderService.getAllOrders();
    }
}
