package com.itheima.controller;

import com.itheima.po.Order;
import com.itheima.mapper.UserMapper;
import com.itheima.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

/**
 * @Description
 * @Author lujichao
 * @Date 2019/3/7
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final RestTemplate restTemplate;
    private final UserMapper userMapper;

    @Value("${ORDERSERVICEURL}")
    private String ORDERSERVICEURL;

    @Autowired
    public UserController(RestTemplate restTemplate, UserMapper userMapper) {
        this.restTemplate = restTemplate;
        this.userMapper = userMapper;
    }

    @GetMapping(path = "/findOrders/{username}")
    public List<Order> getOrderByUsername(@PathVariable("username") String username){
        User user = this.userMapper.selectUser(username);
        ResponseEntity<List<Order>> rateResponse= restTemplate.exchange(ORDERSERVICEURL+"/order/findOrders/"+user.getId(), HttpMethod.GET, null, new ParameterizedTypeReference<List<Order>>() {
        });
        List<Order> orders = rateResponse.getBody();
        return orders;
    }
}
