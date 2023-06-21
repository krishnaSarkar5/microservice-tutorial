package com.ecommerce.productservice.service.seriveImpl.product;

import com.ecommerce.productservice.dto.request.product.CreateProductRequestDto;
import com.ecommerce.productservice.dto.response.ResponseDto;
import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.service.daoservice.ProductDaoService;
import com.ecommerce.productservice.utility.ResponseUtil;
import org.springframework.stereotype.Component;

@Component
public class CreateProductService {

    private final ProductDaoService productDaoService;

    private final ResponseUtil responseUtil;


    public CreateProductService(ProductDaoService productDaoService, ResponseUtil responseUtil) {
        this.productDaoService = productDaoService;
        this.responseUtil=responseUtil;
    }

    public ResponseDto creteProduct(CreateProductRequestDto request){
        Product product = new Product(request);
        Product savedProduct = productDaoService.saveProduct(product);

        return responseUtil.getSuccessResponse(savedProduct);
    }
}
