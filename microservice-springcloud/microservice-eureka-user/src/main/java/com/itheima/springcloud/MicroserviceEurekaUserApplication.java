package com.itheima.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient   //声明标注类是一个Eureka客户端组件
@RestController
public class MicroserviceEurekaUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaUserApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
    @Bean
    @LoadBalanced  //被此注解后,就具有了负载均衡的能力
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
