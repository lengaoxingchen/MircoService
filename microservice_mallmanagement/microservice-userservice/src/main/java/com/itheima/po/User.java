package com.itheima.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/7
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String username;
    private String address;
}
