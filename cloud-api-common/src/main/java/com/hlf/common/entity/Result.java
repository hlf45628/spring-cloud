package com.hlf.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import redis.clients.jedis.Jedis;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T>  {

    public  String code;

    public  String message;

     public   T   data;

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.16.129",6379);
        System.out.println(jedis.ping());
        jedis.set("k3","122");
        jedis.setex("k4",10,"333");
        System.out.println(jedis.get("k3"));
        System.out.println(jedis.get("k3"));
    }


}
