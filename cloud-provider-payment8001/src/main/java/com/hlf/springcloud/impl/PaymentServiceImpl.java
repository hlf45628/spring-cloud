package com.hlf.springcloud.impl;

import com.hlf.common.entity.Payment;
import com.hlf.springcloud.dao.PaymentMapper;
import com.hlf.springcloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }

    @Override
    public int insertPayment(Payment payment) {
        return paymentMapper.insertPayment(payment);
    }

    @Override
    public String readTimeout() {
        try {
            Thread.sleep(3000);
        }catch(InterruptedException e){
            log.error(e.getMessage());
        }
        return "读取时间3秒钟";
    }


}
