package com.dyj.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/testInterceptor")
    public String test(){
        return "success";
    }
    @RequestMapping("/testExectpionHandler")
    public String testExectpionHandler(){
        System.out.println(1/0);
        return "success";
    }
}
