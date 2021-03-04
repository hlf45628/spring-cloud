package com.hlf.springcloud.controller;


import com.hlf.common.entity.Payment;
import com.hlf.common.entity.Result;
import com.hlf.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    public  String serverPort;

    @GetMapping(value ="/payment/get/{id}")
    public Result<Payment> getPaymentById(@PathVariable(value ="id")  Long id){
        Result<Payment> result =new Result<>();
        Payment payment=paymentService.getPaymentById(id);
        log.info("开始热部署了");
        if(payment!=null){
            return new Result<Payment>("200","查询成功"+serverPort,payment);
        }else{
            return new Result<Payment>("-200","查询失败"+serverPort,null);
        }
    }
    @GetMapping(value ="/payment/readTimeout")
    public String readTimeOut(){
        return  paymentService.readTimeout();
    }
    @PostMapping(value = "/payment/create")
    public Result<Integer> insertPayment( @RequestBody  Payment payment){
      int i=paymentService.insertPayment(payment);
      if(i>0){
          return  new Result<Integer>("200","新增成功"+serverPort,i);
      }else{
          return  new Result<Integer>("200","新增失败"+serverPort,i);
      }
    }

}
