package com.itheima.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 客户控制器类, 监听和读取消息
 * @Author lujichao
 * @Date 2019/3/5
 */
@RestController
@Slf4j
public class CustomerController {
    /**
     * 监听和读取消息
     */
    @JmsListener(destination = "active.queue")  //用于监听JMS消息的注解,destination用来指定要监听的目的地
    public void readActiveQueue(String message) {
        log.info("接收到:" + message);
    }
}
