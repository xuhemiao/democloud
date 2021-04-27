package com.xu.custermer.hysix;

import com.xu.custermer.feign.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author xhm
 * @data 2021/4/26 16:01
 */
@Component
public class HelloHystix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name")String name) {
        return "hello" +name+", this messge send failed ";
    }
}
