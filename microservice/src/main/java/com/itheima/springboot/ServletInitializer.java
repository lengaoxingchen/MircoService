//package com.itheima.springboot;
//
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//
///**
// * @Description 产生一个可用的war包,需要提供一个SpringBootServletInitializer,并覆盖configure()方法
// * 1.把应用的主类修改为继承SpringBootServletInitializer的类,并覆盖configure()方法
// * 2.创建一个继承了SpringBootServletInitializer的类,并覆盖configure()方法
// * 下面实现2的操作
// * @Author lujichao
// * @Date 2019/3/5
// */
//public class ServletInitializer extends SpringBootServletInitializer {
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(SpringbootApplication.class);
//    }
//}
