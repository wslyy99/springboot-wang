package com.springboot.wang.utils; /**
 * Created by wangshuai on 2017/6/13.
 */

import com.springboot.wang.SpringbootWangWebApplicationTests;
import com.springboot.wang.redis.IRedisRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wang
 * @date 2017-06-13-16:43
 */
public class SpringbootRedisApplicationTests extends SpringbootWangWebApplicationTests {
    public static Logger logger= LoggerFactory.getLogger(SpringbootRedisApplicationTests.class);
    @Test
    public void contextLoads() {
    }


    @Autowired
    private IRedisRepository redisRepository;

    @Test
    @Ignore
    public void testSaveRedis(){

        redisRepository.set("name", "wang test3");
        logger.info("Redis存储成功");
    }

    @Test
    //@Ignore
    public void testGetRedis(){

        String name = redisRepository.get("name");
        logger.info("Redis获取"+name);
    }
}
