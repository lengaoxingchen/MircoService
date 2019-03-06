package com.itheima.springcloud.utils;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 用于监听服务实例端口的工具类
 * @Author lujichao
 * @Date 2019/3/6
 */
@Configuration //注册组件
public class ServiceInfoUtil implements ApplicationListener<WebServerInitializedEvent> {
    private static WebServerInitializedEvent webServerInitializedEvent;

    /**
     * 声明event对象,该对象用于获取运行服务器的本地端口
     *
     * @param webServerInitializedEvent
     */
    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {

        ServiceInfoUtil.webServerInitializedEvent = webServerInitializedEvent;

    }

    /**
     * 获取端口号
     * @return
     */
    public static int getPort() {
        int port = webServerInitializedEvent.getWebServer().getPort();
        System.out.println(port);
        return port;
    }
}
