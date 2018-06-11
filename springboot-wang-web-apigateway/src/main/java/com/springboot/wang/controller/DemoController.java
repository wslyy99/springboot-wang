package com.springboot.wang.controller;/**
 * Created by wangshuai on 2017/5/18.
 */

import com.springboot.wang.entity.demo.Demo;
import com.springboot.wang.serviceimpl.demo.DemoServiceImpl;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wang
 * @date 2017-05-18-11:31
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoServiceImpl demoService;

    @ApiOperation(value="获取实例的用户信息", notes="根据url的id来获取详细信息")
    @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "Long",paramType = "path")
    @RequestMapping(value ="/get/{id}", method= RequestMethod.GET)
    public Demo get(@PathVariable("id")Integer id){
        Demo demo=demoService.getDemoById(id);
        System.out.println("demo:"+demo.getName()+","+demo.getPhone());
        return demo;
    }

    @ApiOperation(value="获取测试实例", notes="获取测试实例")
    @RequestMapping(value = "/test" , method= RequestMethod.GET)
    public String test(){
        System.out.println("这是一个测试controller");
        return "wang";
    }

    @ApiOperation(value="创建信息", notes="根据参数创建实例信息")
    @ApiImplicitParam(name = "user", value = "图书详细实体", required = true, dataType = "Demo")
    @RequestMapping(value ="/add", method= RequestMethod.POST)
    public Integer add(@RequestBody Demo user){
        return demoService.insertEntity(user);
    }

}
