package com.springboot.wang.activemq.service;/**
 * Created by wangshuai on 2017/6/27.
 */

/**
 * @author wang
 * @date 2017-06-27-10:43
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;
import javax.jms.Topic;

@Service
public class MQProduceService {

    private Logger logger = LoggerFactory.getLogger(MQProduceService.class);

    @Autowired // 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
    private JmsMessagingTemplate jmsTemplate;

    @Autowired
    private Queue queue;


    @Autowired
    private Topic topic;

    // 发送队列字符串消息
    public void sendMessage(String message){
        jmsTemplate.convertAndSend(this.queue, message);
    }

    // 发送bytes消息
    public void sendMessage(byte[] bytes){
        jmsTemplate.convertAndSend(this.queue, bytes);
        logger.info("生产者：辛苦生产的队列消息");
    }

    // 发送订阅主题（topic）字符串消息
    public void sendTopicMessage(String message){
       jmsTemplate.convertAndSend(this.topic, "生产者辛苦生产的订阅/发布消息成果");
        logger.info("生产者：辛苦生产的订阅/发布消息");
    }


}
