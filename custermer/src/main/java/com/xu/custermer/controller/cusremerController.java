package com.xu.custermer.controller;

import com.xu.custermer.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class cusremerController {
        @Autowired
        HelloRemote helloRemote;
        @RequestMapping("/hello/{name}")
        public String hello(@PathVariable("name")String name){
            return helloRemote.hello(name);
        }
    }
