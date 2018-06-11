package com.springboot.wang.exception;/**
 * Created by wangshuai on 2017/6/16.
 */

/**
 * @author wang
 * @date 2017-06-16-14:36
 */
public class BusinessException extends Exception {

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }
}
