package com.springboot.wang.controller;

import com.springboot.wang.SpringbootWangWebApplicationTests;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @description Controller测试
 * @className:DemoControllerTest
 * @method
 * @param
 * @return
 * @date: 2017/5/19 17:38
 * @author:wangshuai
 * @throw
 */
public class DemoControllerTest extends SpringbootWangWebApplicationTests {
    @Test
    public void testGet() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/demo/get/1")
                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}
