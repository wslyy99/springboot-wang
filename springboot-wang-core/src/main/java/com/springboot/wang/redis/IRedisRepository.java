package com.springboot.wang.redis;/**
 * Created by wangshuai on 2017/6/13.
 */

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wang
 * @date 2017-06-13-17:37
 */
@Component
public interface IRedisRepository {

    public abstract long del(String... keys);

    public abstract void set(byte[] key, byte[] value, long liveTime);

    public abstract void set(String key, String value, long liveTime);

    public abstract void set(String key, String value);

    public abstract void set(byte[] key, byte[] value);

    public abstract String get(String key);
    public String hget(String key, String hashKey);
    public void hset(String key, String hashKey, String value);
    public List<String> hmget(String key, Collection<String> hashKeys);
    public void hmset(String key, Map<String, String> m);

    public abstract Set<?> keys(String pattern);

    public abstract boolean exists(String key);

    public abstract String flushDB();

    public abstract long dbSize();

    public abstract String ping();

    Long lpush(String key, String ... values);

    Long rpush(String key, String ... values);

    Long lpush(String key, String value);

    Long rpush(String key, String value);

    Set<String> zrange(String key, int start, int end);

    Set<String> zrange(String key);

    Long sadd(String key, String... values);

    Set<String> smembers(String key);

    Boolean zadd(String key, String value, double score);

    void hdel(String key, Object... hashKeys);
}