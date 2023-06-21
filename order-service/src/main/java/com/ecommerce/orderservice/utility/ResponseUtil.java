package com.ecommerce.orderservice.utility;


import com.ecommerce.orderservice.dto.response.ResponseDto;
import com.ecommerce.orderservice.utility.constantUtils.ConstantUtils;
import org.springframework.stereotype.Component;

@Component
public class ResponseUtil {


    private final ConstantUtils constantUtils;


    public ResponseUtil(ConstantUtils constantUtils) {
        this.constantUtils = constantUtils;
    }

    public ResponseDto getSuccessResponse(Object data, String message){
        return ResponseDto.builder()
                .status(true)
                .message(message)
                .data(data)
                .build();
    }


    public  ResponseDto getSuccessResponse(Object data){
        return ResponseDto.builder()
                .status(true)
                .message(constantUtils.getResponseConstantUtils().getSuccessMessage())
                .data(data)
                .build();
    }


    public  ResponseDto getFailureMessage(String message){
        return ResponseDto.builder()
                .status(false)
                .message(message)
                .data(null)
                .build();
    }

    public  ResponseDto getFailureMessage(){
        return ResponseDto.builder()
                .status(false)
                .message(constantUtils.getResponseConstantUtils().getFailureMessage())
                .data(null)
                .build();
    }
}
