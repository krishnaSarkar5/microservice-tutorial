package com.ecommerce.productservice.service.seriveImpl.product;

import com.ecommerce.productservice.dto.request.product.CreateProductRequestDto;
import com.ecommerce.productservice.dto.request.product.GetProductByIdDto;
import com.ecommerce.productservice.dto.response.ResponseDto;
import com.ecommerce.productservice.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {


    private CreateProductService createProductService;

    private GetProductService getProductService;

    public ProductServiceImpl(CreateProductService createProductService, GetProductService getProductService) {
        this.createProductService = createProductService;
        this.getProductService = getProductService;
    }

    @Override
    public ResponseDto createProduct(CreateProductRequestDto request) {
        return createProductService.creteProduct(request);
    }

    @Override
    public ResponseDto getProduct(GetProductByIdDto request) {
        return getProductService.getProductById(request);
    }

    @Override
    public ResponseDto getProductList() {
        return getProductService.getAllProducts();
    }
}
