package com.itheima.po;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/8
 */
@Data
public class Order {
    private Integer id;
    private Date createtime;
    private String number;
    private Integer userid;
}
