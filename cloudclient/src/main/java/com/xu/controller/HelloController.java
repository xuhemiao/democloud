package com.xu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xhm
 * @data 2021/4/27 15:33
 */
@RestController
public class HelloController {
    @Value("${neo.hello}")
    private String hello;
    @RequestMapping(("/hello"))
    public String from(){
        return this.hello;
    }
}
