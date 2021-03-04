package com.hlf.openfeign.fallback;

import com.hlf.common.entity.Payment;
import com.hlf.common.entity.Result;
import com.hlf.openfeign.service.PaymentFeignService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFeignServiceFallBack implements PaymentFeignService {

    public Result<Payment> getPaymentById(Long id) {
        return new Result<Payment>("401","系统繁忙",null);
    }

    @Override
    public String readTimeOut() {
        return "服务超时";
    }
}
