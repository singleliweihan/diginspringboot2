package com.digin.sp2.config;


import com.digin.sp2.domain.Pet;
import com.digin.sp2.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.awt.*;

/**
 *@Configuration标志着这是一个配置类
 * 配置类本身也是一个组件
 *
 * proxyBeanMethods==true 表示配置类是否使用代理,
 *  true的时候容器中配置类的对象是他的代理类对象,这是Full模式(重量级模式)
 *      使用代理类对象的时候,调用@Bean的方法,首先检查容器是否已经包含组件,若包含则直接获取(保证组件始终是单例)
 *      用于解决组件依赖的场景(一个组件的属性是另一个组件--要保证每次获取到的属性值不变)
 *  false的时候不适用代理类,表示Lite模式(轻量级模式),
 *      在没有组件依赖的情况下,采用轻量级模式,保证启动和组件获取更快
 */
@Configuration(proxyBeanMethods=true)
public class MyConfig {
    /**
     * 默认使用方法名作为对象id,也可以通过@Bean的name属性执行
     * @return 返回值类型即是组建类型,在IoC容器中可以通过getBean方法获取到
     *这里默认都是单例
     */
    @Bean
    @ConditionalOnBean(name = "petoftom")
    public User user01(){
        return new User("Tom01",11);
    }

    @Bean("petoftom")
    public Pet pet01(){
        return new Pet("阿狗","狗崽子");
    }



    /**
     * 给容器添加组件的方式
     * @Bean
     * @Component @Controller
     * @Service  @Repository
     *
     * @ComponentScan
     *
     * @Import({A.class,b.class})
     * 只能用在其他组件上（通过上前面五种方式如@Controller等添加的组件类上）
     *  调用无参构造器创建A和B的对象，默认组件id是全限定名
     *
     *
     * @Conditional 根注解,贴方法或者类,满足指定条件的时候才注册这个注解贴的组件
     *      派生注解    @ConditionalOnBean(name = "petoftom")
     *                  @ConditionalOnMissingBean
     *
     *
     */

}
