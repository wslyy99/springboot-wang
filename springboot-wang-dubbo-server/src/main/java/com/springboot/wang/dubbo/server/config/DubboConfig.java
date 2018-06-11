package com.springboot.wang.dubbo.server.config;/**
 * Created by wangshuai on 2017/6/16.
 */


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author wang
 * @date 2017-06-16-14:01
 */

@Configuration
@PropertySource("classpath:dubbo/dubbo.properties")
@ImportResource({ "classpath:dubbo/*.xml" })
public class DubboConfig {

}
