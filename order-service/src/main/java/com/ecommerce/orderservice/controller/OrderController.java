package com.ecommerce.orderservice.controller;



import com.ecommerce.orderservice.dto.request.product.CreateOrderRequestDto;
import com.ecommerce.orderservice.dto.request.product.GetOrderByIdDto;
import com.ecommerce.orderservice.dto.response.ResponseDto;
import com.ecommerce.orderservice.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create-order")
    public ResponseEntity<ResponseDto> createProduct(@RequestBody CreateOrderRequestDto request){
        return new ResponseEntity<ResponseDto>(orderService.createOrder(request), HttpStatus.CREATED);
    }

    @PostMapping("/get-order")
    public ResponseEntity<ResponseDto> getProductById(@RequestBody GetOrderByIdDto request){
        return new ResponseEntity<ResponseDto>(orderService.getOrder(request), HttpStatus.CREATED);
    }

    @GetMapping("/all-orders")
    public ResponseEntity<ResponseDto> getAllProducts(){
        return new ResponseEntity<ResponseDto>(orderService.getOrderList(), HttpStatus.CREATED);
    }
}
