package com.springboot.wang.lib.pageination.dialect;/**
 * Created by wangshuai on 2017/5/17.
 */

import com.springboot.wang.lib.pagination.Page;

/**
 * @author wang
 * @date 2017-05-17-14:47
 */

public interface Dialect {

    String pageSql(String sql, Page page);
}