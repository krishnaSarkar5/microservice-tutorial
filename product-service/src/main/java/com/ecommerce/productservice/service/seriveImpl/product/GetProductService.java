package com.ecommerce.productservice.service.seriveImpl.product;

import com.ecommerce.productservice.dto.request.product.GetProductByIdDto;
import com.ecommerce.productservice.dto.response.ResponseDto;
import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.service.daoservice.ProductDaoService;
import com.ecommerce.productservice.utility.ResponseUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GetProductService {

    private final ProductDaoService productDaoService;

    private final ResponseUtil responseUtil;

    public GetProductService(ProductDaoService productDaoService, ResponseUtil responseUtil) {
        this.productDaoService = productDaoService;
        this.responseUtil = responseUtil;
    }
    
    
    public ResponseDto getProductById(GetProductByIdDto request){
        Optional<Product> productById = productDaoService.getProductById(request.getId());
        return responseUtil.getSuccessResponse(productById.get());
    }


    public ResponseDto getAllProducts(){
        List<Product> allProducts = productDaoService.getAllProducts();
        return responseUtil.getSuccessResponse(allProducts);
    }
}
