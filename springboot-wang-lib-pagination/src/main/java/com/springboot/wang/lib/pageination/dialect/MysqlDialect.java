package com.springboot.wang.lib.pageination.dialect;/**
 * Created by wangshuai on 2017/5/17.
 */

import com.springboot.wang.lib.pagination.Page;

/**
 * @author wang
 * @date 2017-05-17-14:48
 */

public class MysqlDialect implements Dialect{

    @Override
    public String pageSql(String sql, Page page) {

        StringBuffer querySql =
                new StringBuffer("SELECT * FROM ( ").append(sql).append(" ) AS COUNT_PAGE")
                        .append(" LIMIT ").append( page.getStart() ).append(" , ").append(page.getPageSize());
        return querySql.toString();
    }
}