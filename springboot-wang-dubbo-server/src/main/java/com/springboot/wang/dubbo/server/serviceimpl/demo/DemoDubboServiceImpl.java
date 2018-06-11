package com.springboot.wang.dubbo.server.serviceimpl.demo;


import com.springboot.wang.dubbo.facade.demo.IDemoDubboService;
import org.springframework.stereotype.Service;

/**
 * Created by Wang on 2017/2/14.
 */
@Service(value = "demoDubboService")
public class DemoDubboServiceImpl implements IDemoDubboService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
