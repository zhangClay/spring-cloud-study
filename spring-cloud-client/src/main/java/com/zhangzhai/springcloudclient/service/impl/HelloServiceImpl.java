package com.zhangzhai.springcloudclient.service.impl;

import com.zhangzhai.springcloudclient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;


@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private DiscoveryClient client;

    @Override
    public String sayHello() {
        ServiceInstance serviceInstance = client.getLocalServiceInstance();
        return "hello world";
    }
}
