package com.ecommerce.productservice.utility.constantUtils;

import org.springframework.stereotype.Component;

@Component
public class ConstantUtils {


    private final ResponseConstantUtils responseConstantUtils;

    public ConstantUtils(ResponseConstantUtils responseConstantUtils) {
        this.responseConstantUtils = responseConstantUtils;
    }


    public ResponseConstantUtils getResponseConstantUtils(){
        return responseConstantUtils;
    }
}
