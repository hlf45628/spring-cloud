package com.hlf.springcloud.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.hlf.springcloud.dao")
@SpringBootApplication(scanBasePackages ={"com.hlf.springcloud"})
public class PaymentApplicationMain{

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplicationMain.class,args);
    }

}
