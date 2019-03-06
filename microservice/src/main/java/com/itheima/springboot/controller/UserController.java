package com.itheima.springboot.controller;

import com.itheima.springboot.po.User;
import com.itheima.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/5
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //查询所有用户
    @RequestMapping("/userList")
    public List<User> getAllUsers() {
        List<User> list = userService.getAllUsers();
        return list;
    }

    //删除用户
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        this.userService.delete(id);
    }

}
