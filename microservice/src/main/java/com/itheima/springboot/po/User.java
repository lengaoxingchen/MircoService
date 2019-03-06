package com.itheima.springboot.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description User实体类
 * @Author lujichao
 * @Date 2019/3/5
 */
@Data
public class User implements Serializable {
    private static final long serialVersion = 1L;
    private Integer id;
    private String username;
    private String address;
}
