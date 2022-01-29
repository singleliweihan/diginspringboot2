package com.digin.sp2;

import com.digin.sp2.domain.Pet;
import com.digin.sp2.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类/启动类
 * @SpringBootApplication标志着这是一个Springboot应用
 *
 * Springboot配置的默认包扫描规则为:主程序类及其同层级目录下的子包
 * 如果需要手动指定,需要配置注解的scanBasePackages属性
 */
@SpringBootApplication(scanBasePackages = "com.digin")
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

        //3.检验自定义组件
        System.out.println("自定义组件");
        User user01 = configContext.getBean("user01", User.class);
        System.out.println(user01);

        Pet pet = configContext.getBean("petoftom", Pet.class);
        System.out.println(pet);

    }
}
