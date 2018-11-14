package com.zhangzhai.springcloudclient.controller;

import com.zhangzhai.springcloudclient.service.HelloService;

//import org.apache.log4j.Logger;
import jdk.internal.dynalink.support.AutoDiscovery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/hello")
public class HelloController {
    //private final Logger logger = Logger.getLogger(getClass());
    @Resource
    private HelloService helloService;
@Resource
private AutoDiscovery autoDiscovery;
    @RequestMapping("/sayHello")
    public String sayHello(){

        return helloService.sayHello();
    }
}
