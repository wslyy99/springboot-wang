package com.springboot.wang.dao.demo;/**
 * Created by wangshuai on 2017/5/18.
 */

import com.springboot.wang.entity.demo.Demo;
import com.springboot.wang.lib.pagination.Page;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wang
 * @date 2017-05-18-14:10
 */
@Component
public interface DemoMapper {
    /**
     * @Description: 根据主键删除数据库的记录
     * @Title deleteByPrimaryKey
     * @Author jon lv
     * @Date 2017/05/12 15:24
     * @param id
     * @return int
     * @throws []
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @Description: 插入数据库记录
     * @Title insert
     * @Author jon lv
     * @Date 2017/05/12 15:24
     * @param record
     * @return int
     * @throws []
     */
    int insert(Demo record);

    /**
     * @Description: 选择性插入数据库记录
     * @Title insertSelective
     * @Author jon lv
     * @Date 2017/05/12 15:24
     * @param record
     * @return int
     * @throws []
     */
    int insertSelective(Demo record);

    /**
     * @Description: 根据主键获取一条数据库记录
     * @Title selectByPrimaryKey
     * @Author jon lv
     * @Date 2017/05/12 15:24
     * @param id
     * @return org.jon.lv.domain.Demo
     * @throws []
     */
    Demo selectByPrimaryKey(Integer id);

    /**
     * @Description: 根据主键来更新对应数据库字段
     * @Title updateByPrimaryKeySelective
     * @Author jon lv
     * @Date 2017/05/12 15:24
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeySelective(Demo record);

    /**
     * @Description: 根据主键来更新数据库记录
     * @Title updateByPrimaryKey
     * @Author jon lv
     * @Date 2017/05/12 15:24
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKey(Demo record);

    List<Demo> queryPage(Page<Demo> page);
}
