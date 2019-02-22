package com.zhangzhai.springcloudclient.controller;

import com.zhangzhai.springcloudclient.service.HelloService;

import com.zhangzhai.springcloudclient.utils.log.LogUtils;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/hello")
public class HelloController {
    //private final Logger logger = Logger.getLogger(getClass());
    @Resource
    private HelloService helloService;

    @RequestMapping("/sayHello")
    public String sayHello() {

        return helloService.sayHello();
    }

    @GetMapping("/test")
    public String test() throws Exception {

        Logger log = LogUtils.getExceptionLogger();
        Logger log1 = LogUtils.getBussinessLogger();
        Logger log2 = LogUtils.getDBLogger();

        log.error("getExceptionLogger===日志测试");
        log1.info("getBussinessLogger===日志测试");
        log2.debug("getDBLogger===日志测试");
        return "test";
    }
}
