package com.zhangzhai.springcloudclay.service.impl;

import com.zhangzhai.springcloudclay.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello clay!!!";
    }
}
