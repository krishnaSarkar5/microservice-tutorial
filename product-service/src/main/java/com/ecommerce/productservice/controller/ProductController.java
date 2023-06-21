package com.ecommerce.productservice.controller;


import com.ecommerce.productservice.dto.request.product.CreateProductRequestDto;
import com.ecommerce.productservice.dto.request.product.GetProductByIdDto;
import com.ecommerce.productservice.dto.response.ResponseDto;
import com.ecommerce.productservice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create-product")
    public ResponseEntity<ResponseDto> createProduct(@RequestBody CreateProductRequestDto request){
        return new ResponseEntity<ResponseDto>(productService.createProduct(request), HttpStatus.CREATED);
    }

    @PostMapping("/get-product")
    public ResponseEntity<ResponseDto> getProductById(@RequestBody GetProductByIdDto request){
        return new ResponseEntity<ResponseDto>(productService.getProduct(request), HttpStatus.CREATED);
    }

    @GetMapping("/all-products")
    public ResponseEntity<ResponseDto> getAllProducts(){
        return new ResponseEntity<ResponseDto>(productService.getProductList(), HttpStatus.CREATED);
    }
}
