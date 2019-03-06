package com.itheima.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope  //开启refresh机制.添加此注解后,在执行/refresh时会更新该注解标注类下的所有变量值,包括中ConfigClient从git仓库中获取的配置
public class MicroserviceConfigClientApplication {

    @Value("${clientParam}")
    private String clientParam;

    @RequestMapping("/clientParam")
    public String getParam(){
        return this.clientParam;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }



    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConfigClientApplication.class, args);
    }

}
