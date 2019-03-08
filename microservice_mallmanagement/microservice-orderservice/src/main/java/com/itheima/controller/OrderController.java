package com.itheima.controller;

import com.itheima.mapper.OrderMapper;
import com.itheima.po.Order;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/7
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderMapper orderMapper;

    public OrderController(OrderMapper orderMapper) {

        this.orderMapper = orderMapper;
    }

    @GetMapping(path = "/findOrders/{userid}")
    @HystrixCommand(fallbackMethod = "findOrderFallback")
    public List<Order> findOrder(@PathVariable("userid") String userid){
        List<Order> orders = this.orderMapper.selectOrder(Integer.parseInt(userid));
        return orders;
    }

    //针对上面断路器发现的问题编写回调方法（参数和返回值要一样）否则请求会报500的错误
    public List<Order> findOrderFallback(String userid){
        List<Order> orders = new ArrayList<>();
        return orders;
    }
}
