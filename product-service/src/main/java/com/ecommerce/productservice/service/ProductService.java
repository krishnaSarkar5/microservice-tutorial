package com.ecommerce.productservice.service;

import com.ecommerce.productservice.dto.request.product.CreateProductRequestDto;
import com.ecommerce.productservice.dto.request.product.GetProductByIdDto;
import com.ecommerce.productservice.dto.response.ResponseDto;

public interface ProductService {


    ResponseDto createProduct(CreateProductRequestDto request);


    ResponseDto getProduct(GetProductByIdDto request);


    ResponseDto getProductList();
}
