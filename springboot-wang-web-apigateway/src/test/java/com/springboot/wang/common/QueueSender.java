package com.springboot.wang.common;/**
 * Created by wangshuai on 2017/6/26.
 */

/**
 * @author wang
 * @date 2017-06-26-13:29
 */

import com.springboot.wang.SpringbootWangWebApplicationTests;
import com.springboot.wang.activemq.service.MQProduceService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

//@ContextConfiguration(locations={"classpath:spring-mq-queue.xml"})
public class QueueSender extends SpringbootWangWebApplicationTests {

    /** Hardware id for test message */
    private static final String HARDWARE_ID = "aaa";

    @Autowired
    private MQProduceService produceService;

    @Test
    public void sendMq() {
        String message = "LOC," + HARDWARE_ID + ",33.7550,-84.3900";
        byte[] encoded = message.getBytes();
        produceService.sendMessage(encoded);
    }

}