package com.dsfzl.mybatis.mapping;

import com.dsfzl.mybatis.binding.MapperMethod;

import java.util.Map;

/**
 * @author: dsf
 * @description: 绑定的SQL,是从SqlSource而来，将动态内容都处理完成得到的SQL语句字符串，其中包括?,还有绑定的参数
 * @date 2024/11/25 下午7:44
 */

public class BoundSql {

    private String sql;
    private Map<Integer, String> parameterMappings;
    private String parameterType;
    private String resultType;

    public BoundSql(String sql, Map<Integer, String> parameterMappings, String parameterType, String resultType) {
        this.sql = sql;
        this.parameterMappings = parameterMappings;
        this.parameterType = parameterType;
        this.resultType = resultType;
    }

    public String getSql() {
        return sql;
    }

    public Map<Integer, String> getParameterMappings() {
        return parameterMappings;
    }

    public String getParameterType() {
        return parameterType;
    }

    public String getResultType() {
        return resultType;
    }
}