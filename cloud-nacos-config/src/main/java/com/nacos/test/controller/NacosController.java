package com.nacos.test.controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NacosController {


    @Value("${info.msg}")
    public  String msg;

    @RequestMapping("/hello")
    public String getCongig(){
        return  "msg="+msg;
    }

}
