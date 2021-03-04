package com.hlf.openfeign.service;

import com.hlf.common.entity.Payment;
import com.hlf.common.entity.Result;
import com.hlf.openfeign.fallback.PaymentFeignServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value ="CLOUD-PAYMENT-SERVICE",fallback =PaymentFeignServiceFallBack.class)
@Component
public interface PaymentFeignService {


    @GetMapping(value ="/payment/get/{id}")
    public Result<Payment> getPaymentById(@PathVariable(value ="id") Long id);


    @GetMapping(value ="/payment/readTimeout")
    public String  readTimeOut();
}
