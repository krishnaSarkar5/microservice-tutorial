package com.ecommerce.orderservice.service.daoservice;


import com.ecommerce.orderservice.entity.Order;
import com.ecommerce.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderDaoService {

    private OrderRepository orderRepository;

    public OrderDaoService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

    public Optional<Order> getOrderById(Long id){
        return orderRepository.findById(id);
    }


    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
}
