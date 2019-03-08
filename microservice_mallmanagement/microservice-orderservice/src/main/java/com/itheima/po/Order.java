package com.itheima.po;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/7
 */
@Data
public class Order {
    private Integer id;
    private Date create_time;
    private String number;
    private Integer userid;
}
