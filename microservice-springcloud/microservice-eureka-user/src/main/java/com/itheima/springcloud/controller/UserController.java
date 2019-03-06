package com.itheima.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/6
 */
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findOrdersByUser/{id}")
    public String findOrdersByUser(@PathVariable String id) {
        //假设用户只有一个订单,并且订单id为123
        int old = 123;
        //return this.restTemplate.getForObject("http://localhost:7900/order/"+old,String.class);
        return this.restTemplate.getForObject("http://microservice-eureka-order/"+old,String.class);

    }
}
