package com.springboot.wang.facade.demo;/**
 * Created by wangshuai on 2017/5/18.
 */

import com.springboot.wang.entity.demo.Demo;
import com.springboot.wang.lib.pagination.Page;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author wang
 * @date 2017-05-18-12:01
 */
@Component
public interface IDemoService {
    /**
     * 根据主键id查询出来对应的name字段
     * @param id
     * @return
     */
    public Demo getDemoById(Integer id);

    /**
     * 插入操作，插入实体数据
     * @param demo
     * @return
     */
    public int insertEntity(Demo demo);

    /**
     * 分页条件查询
     *
     * @param pageNumber
     * @param pageSize
     * @return
     */
    public Page<Demo> queryPage(Integer pageNumber, Integer pageSize);
}
