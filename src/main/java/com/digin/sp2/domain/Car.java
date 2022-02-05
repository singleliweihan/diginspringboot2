package com.digin.sp2.domain;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 方式一: @Component + @ConfigurationProperties
 * 方式二: @EnableConfigurationProperties + @ConfigurationProperties 这里也会注册为组件，前一个注解（enable。。）要贴在配置类上
 */

@Component  //注册为组件才能使用SpringBoot的功能(交给容器管理)
@ConfigurationProperties(prefix = "mycar") //SpringBoot的功能
public class Car {
    private String brand;
    private Integer price;

    public Car() {
    }

    public Car(String brand, Integer price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
