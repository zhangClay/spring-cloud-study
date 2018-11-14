package com.zhangzhai.springcloudclient.service.impl;

import com.zhangzhai.springcloudclient.service.HelloService;
import org.springframework.stereotype.Service;


@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello world";
    }
}
