package com.hlf.springcloud.service;

import com.hlf.common.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

public interface PaymentService {

    public Payment getPaymentById(@Param("id") Long id);

    public int  insertPayment(Payment payment);

    String readTimeout() ;
}
