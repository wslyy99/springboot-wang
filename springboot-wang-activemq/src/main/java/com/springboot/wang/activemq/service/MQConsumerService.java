package com.springboot.wang.activemq.service;/**
 * Created by wangshuai on 2017/6/27.
 */

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @author wang
 * @date 2017-06-27-13:49
 */
@Service
public class MQConsumerService {

    private String text;

    @JmsListener(destination = "SITEWHERE.IN")//监听指定消息队列
    public void receiveQueue(String text) {
        this.text = text;
        System.out.println(text);
    }

    public String receive() {
        return text;
    }

    @JmsListener(destination = "sample.topic")
    public void receiveSub1(String text) {
        System.out.println("消费者：Consumer1="+text);
    }

    @JmsListener(destination = "sample.topic")
    public void receiveSub2(String text) {
        System.out.println("消费者：Consumer2="+text);
    }
}