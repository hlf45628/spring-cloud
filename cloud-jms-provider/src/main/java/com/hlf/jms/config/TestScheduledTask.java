package com.hlf.jms.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class TestScheduledTask {


    @Scheduled(cron ="*/5 * * * * ?")
    private void execute(){
        System.out.println("执行时间"+System.currentTimeMillis());
    }
}
