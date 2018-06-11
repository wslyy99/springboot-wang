package com.springboot.wang.dubbo.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.springboot.wang.dubbo.client.common.controller.BaseController;
import com.springboot.wang.dubbo.facade.demo.IDemoDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 测试用的 Controller 类；
 * <p/>
 * Created by Wang on 2017/6/14.
 */
@RestController
@RequestMapping("/dubbo")
public class DemoConsumerDubboController extends BaseController{

    @Reference
    IDemoDubboService demoDubboService;

    /**
     * 测试 JSON 接口；
     *
     * @param name 名字；
     * @return
     */
    @ResponseBody
    @RequestMapping("/demo/{name}")
    public JSONObject testJson(@PathVariable("name") String name) {
        JSONObject jsonObject = new JSONObject();
        String testStr = demoDubboService.sayHello(name);
        jsonObject.put("str", testStr);
        return jsonObject;
    }

    @ResponseBody
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public JSONObject hello() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("str", "hello demo");
        return jsonObject;
    }

}
