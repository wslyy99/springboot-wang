package com.springboot.wang.serviceimpl.demo;/**
 * Created by wangshuai on 2017/5/18.
 */

import com.springboot.wang.dao.demo.DemoMapper;
import com.springboot.wang.entity.demo.Demo;
import com.springboot.wang.facade.demo.IDemoService;
import com.springboot.wang.lib.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author wang
 * @date 2017-05-18-11:44
 */
@Service
public class DemoServiceImpl implements IDemoService{

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public Demo getDemoById(Integer id) {
        return demoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertEntity(Demo demo) {
        demoMapper.insert(demo);

        return demo.getId();
    }

    @Override
    public Page<Demo> queryPage(Integer pageNumber, Integer pageSize) {
        Page<Demo> page = new Page<>(pageNumber, pageSize);
        demoMapper.queryPage(page);
        return page;
    }
}
