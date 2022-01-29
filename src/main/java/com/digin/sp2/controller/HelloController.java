package com.digin.sp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("index")
    @ResponseBody
    public String sayHello(){
        return "Hello , User";
    }
}
