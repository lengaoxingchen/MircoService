package com.itheima.mapper;


import com.itheima.po.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Date;

/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMapperTest {
    @Autowired
    OrderMapper orderMapper;

    @Test
    public void saveOrderTest() {
        Order order = new Order();
        order.setId(123);
        order.setCreate_time(new Date());
        order.setNumber("123");
        order.setUserid(1);
        orderMapper.saveOrder(order);
    }

    @Test
    public void selectOrdersByUseridTest() {
        int userid = 1;
        List<Order> orderList=orderMapper.selectOrder(userid);
        for (Order order:orderList
             ) {
            log.info("订单信息"+order.toString());
        }
        Assert.assertNotNull(orderList);
    }
}
