package com.digin.sp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类
 * @SpringBootApplication标志着这是一个Springboot应用
 */
@SpringBootApplication
public class BootApplication {
    public static void main(String[] args) {
        //1.这里的返回值表示IoC容器,包含了当前应用的所有组件
        ConfigurableApplicationContext configContext = SpringApplication.run(BootApplication.class, args);
        //2.查看所有组件名字
        String[] names = configContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
            //在其中可以找到dispatcherServlet,characterEncodingFilter等
        }

    }
}
