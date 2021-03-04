package com.hlf.openfeign.controller;

import com.hlf.common.entity.Payment;
import com.hlf.common.entity.Result;
import com.hlf.openfeign.service.PaymentFeignService;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@Slf4j
public class PaymentController {


    @Resource
    private PaymentFeignService paymentServices;

    
    @RequestMapping(value ="/consumer/order/getPayment/{id}")
    public Result<Payment> getPById(@PathVariable(value ="id")   Long id) {
        return  paymentServices.getPaymentById(id);
    }

    @GetMapping(value ="/consumer/readTimeout")
    public String readTimeOut(){
        return  paymentServices.readTimeOut();
    }

    @GetMapping(value ="/hello/world")
    public String hello(){
        return "hello" ;
    }
}
