package com.itheima.springboot.mapper;

import com.itheima.springboot.po.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description User的接口文件
 * @Author lujichao
 * @Date 2019/3/5
 */
@Mapper
public interface UserMapper {
    //查询所有用户
    @Select("select * from tb_user")
    List<User> getAllUsers();

    //删除用户
    @Delete("delete from tb_user where id=#{id}")
    void delete(Integer id);
}
