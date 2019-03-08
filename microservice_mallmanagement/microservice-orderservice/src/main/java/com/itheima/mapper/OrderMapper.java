package com.itheima.mapper;


import com.itheima.po.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/7
 */
@Mapper
public interface OrderMapper {
    @Insert("insert into tb_order values(#{id},#{create_time},#{number},#{userid})")
    void saveOrder(Order order);


    @Select("select * from tb_order where userid=#{userid}")
    List<Order> selectOrder(Integer userid);
}
