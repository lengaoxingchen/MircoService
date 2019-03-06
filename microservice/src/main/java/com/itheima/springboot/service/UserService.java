package com.itheima.springboot.service;

import com.itheima.springboot.po.User;

import java.util.List;

/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/5
 */
public interface UserService {
    //查询所有用户
    List<User> getAllUsers();

    //删除用户
    void delete(Integer id);
}
