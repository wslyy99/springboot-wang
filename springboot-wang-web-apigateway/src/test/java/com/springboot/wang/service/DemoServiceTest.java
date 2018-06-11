package com.springboot.wang.service;

import com.springboot.wang.SpringbootWangWebApplicationTests;
import com.springboot.wang.entity.demo.Demo;
import com.springboot.wang.lib.pagination.Page;
import com.springboot.wang.serviceimpl.demo.DemoServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description Service测试
 * @className:DemoControllerTest
 * @method
 * @param
 * @return
 * @date: 2017/5/19 17:50
 * @author:wangshuai
 * @throw
 */
public class DemoServiceTest extends SpringbootWangWebApplicationTests {

    @Autowired
    private DemoServiceImpl demoService;

    @Test
    public void testSave(){

        Demo demo = new Demo();
        demo.setName("springboot-wang");
        demo.setSex(1);
        demoService.insertEntity(demo);

        System.out.println(demo);
    }

    @Test
    public void testQueryPage(){
        Page<Demo> page = demoService.queryPage(1,2);
        System.out.println(page);
    }

}
