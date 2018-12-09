package com.study.spring.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.pojo.BaseResponse;
import com.study.spring.pojo.PaymentRequest;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    
    private final String sharedKey = "SHARED_KEY";
    
    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;
 
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public BaseResponse pay(@RequestParam(value = "key") String key, @RequestBody PaymentRequest request) {
        System.out.println("pay method called from payment controller");
        BaseResponse response = new BaseResponse();
        if(sharedKey.equalsIgnoreCase(key))
        {
        	System.out.println("If in pay method");
        	int userId = request.getUserId();
            String itemId = request.getItemId();
            double discount = request.getDiscount();
            
            // Process the request
            // ....
            // Return success response to the client.
            
            response.setStatus(SUCCESS_STATUS);
            response.setCode(CODE_SUCCESS);
        }
        else
        {
        	System.out.println("Else in pay method");
        	response.setStatus(ERROR_STATUS);
            response.setCode(AUTH_FAILURE);
        }
        return response;
    }
}
