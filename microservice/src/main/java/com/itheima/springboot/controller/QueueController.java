package com.itheima.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

/**
 * @Description 队列消息控制器
 * @Author lujichao
 * @Date 2019/3/5
 */
@RestController
public class QueueController {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    /**
     * 消息生产者
     */
    @RequestMapping("/send")
    public void send(){
        //指定消息发送的目的地及内容
        this.jmsMessagingTemplate.convertAndSend(this.queue,"新发送消息");
    }
}
