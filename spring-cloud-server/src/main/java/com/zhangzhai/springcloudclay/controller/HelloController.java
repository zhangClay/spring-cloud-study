package com.zhangzhai.springcloudclay.controller;

import com.zhangzhai.springcloudclay.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private HelloService helloService;

    @RequestMapping("/say")
    public String sayHello() {
        return helloService.sayHello();
    }
}
