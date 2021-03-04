package org.hlf.order.controller;


import com.hlf.common.entity.Payment;
import com.hlf.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {
    public static  String paymentService="http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    public RestTemplate restTemplate;



    @GetMapping(value ="/getPaymentById/{id}")
    public Result<Payment> doOrder(@PathVariable Long id){
        return  restTemplate.getForObject(paymentService+"/payment/get/"+id,Result.class);
    }
}
