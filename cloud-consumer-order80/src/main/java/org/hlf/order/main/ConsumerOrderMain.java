package org.hlf.order.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages ={"org.hlf.order"})
public class ConsumerOrderMain {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderMain.class,args);
    }
}
