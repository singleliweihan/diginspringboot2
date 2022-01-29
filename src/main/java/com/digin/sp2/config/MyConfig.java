package com.digin.sp2.config;


import com.digin.sp2.domain.Pet;
import com.digin.sp2.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@Configuration标志着这是一个配置类
 * 配置类本身也是一个组件
 */
@Configuration
public class MyConfig {
    /**
     * 默认使用方法名作为对象id,也可以通过@Bean的name属性执行
     * @return 返回值类型即是组建类型,在IoC容器中可以通过getBean方法获取到
     *这里默认都是单例
     */
    @Bean
    public User user01(){
        return new User("Tom01",11);
    }

    @Bean("petoftom")
    public Pet pet01(){
        return new Pet("阿狗","狗崽子");
    }
}
