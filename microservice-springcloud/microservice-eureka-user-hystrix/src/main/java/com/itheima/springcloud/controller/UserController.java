package com.itheima.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

/**
 * @Description 用户控制器
 * @Author lujichao
 * @Date 2019/3/6
 */
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 查找与用户相关的订单
     * @param id
     * @return
     */
    @GetMapping("/findOrdersByUser/{id}")
    //@HystrixCommand注解用于指定当前方法发生异常时调用的方法,该方法是通过其属性fallbackMethod的属性值来指定的.
    //注意:回调方法的参数类型以及返回值必须要和元方法保持一致
    @HystrixCommand(fallbackMethod = "fallbackInfo")
    public String findOrdersByUser(@PathVariable String id) {
        //假设用户只有一个订单,并且订单id为123
        int old = 123;
        //return this.restTemplate.getForObject("http://localhost:7900/order/"+old,String.class);
        return this.restTemplate.getForObject("http://microservice-eureka-order/"+old,String.class);

    }

    /**
     * 返回信息方法
     * @param id
     * @return
     */
    public String fallbackInfo(@PathVariable String id){
        return "服务不可用,请稍候再试!";
    }
}
