package com.itheima.springboot.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.itheima.springboot.mapper.UserMapper;
import com.itheima.springboot.po.User;
import com.itheima.springboot.service.UserService;
import lombok.extern.slf4j.Slf4j;





/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/5
 */
@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    //注入用户mapper
    @Autowired
    UserMapper userMapper;

    @Override
    @Cacheable(value = "UserCache",key = "'user.getAllUsers'")
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    @CacheEvict(value = "UserCache",key = "'user.getAllUsers'")
    public void delete(Integer id) {
        log.info("删除了id为"+id+"的用户");
        this.userMapper.delete(id);
    }
}
