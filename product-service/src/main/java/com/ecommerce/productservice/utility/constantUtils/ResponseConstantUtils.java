package com.ecommerce.productservice.utility.constantUtils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ResponseConstantUtils {


    private final String SUCCESS_MESSAGE;


    private final String FAILURE_MESSAGE;



    public ResponseConstantUtils( @Value("${response.success.message}") String successMessage, @Value("${response.failure.message}")String failureResponseMessage) {
        this.SUCCESS_MESSAGE = successMessage;
        this.FAILURE_MESSAGE = failureResponseMessage;
    }




    public String getSuccessMessage(){
        return SUCCESS_MESSAGE;
    }

    public String getFailureMessage(){
        return FAILURE_MESSAGE;
    }
}
