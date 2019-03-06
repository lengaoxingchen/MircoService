package com.itheima.springcloud.po;

import lombok.Data;

/**
 * @Description 订单实体类
 * @Author lujichao
 * @Date 2019/3/6
 */
@Data
public class Order {
    private String id;
    private Double price;
    private String receiverName;
    private String receiverAddress;
    private String receiverPhone;
}
