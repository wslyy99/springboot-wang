package com.springboot.wang.activemq.config;/**
 * Created by wangshuai on 2017/6/27.
 */

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @author wang
 * @date 2017-06-27-13:47
 */
@Configuration
@EnableJms
public class ActiveMQConfig {

    /**
     * 定义点对点队列
     * @return
     */
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("SITEWHERE.IN");
    }

    /**
     * 定义一个主题
     * @return
     */
    @Bean
    public Topic topic() {
         return new ActiveMQTopic("sample.topic");
    }

}
