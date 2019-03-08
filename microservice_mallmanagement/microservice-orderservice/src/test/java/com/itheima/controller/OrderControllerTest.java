package com.itheima.controller;


import com.itheima.po.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderControllerTest {
    @Autowired
    OrderController orderController;

    @Test
    public void findOrder() {
        List<Order> orderList = orderController.findOrder("1");
        for (Order order : orderList) {
            System.out.println(order.toString());
        }
        Assert.assertNotNull(orderList);
    }
}
