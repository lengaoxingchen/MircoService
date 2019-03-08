package com.itheima.controller;


import com.itheima.po.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Autowired
    UserController userController;

    @Test
    public void testGetOrderByUsername() {
        String username = "shitou";
        List<Order> orderList = userController.getOrderByUsername(username);
        System.out.println(orderList.toString());
    }
}