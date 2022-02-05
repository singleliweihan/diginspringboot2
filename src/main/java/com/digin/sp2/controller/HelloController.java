package com.digin.sp2.controller;

import com.digin.sp2.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.PrimitiveIterator;

@Controller
public class HelloController {

    @RequestMapping("/index")
    @ResponseBody
    public String sayHello() {
        return "Hello , User";
    }

    @Autowired
    private Car car;
    @ResponseBody
    @RequestMapping("/car")
    public Car getCar() {
        return car;
    }
}
