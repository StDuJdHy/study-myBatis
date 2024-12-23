package com.dsfzl.mybatis.session;

import com.dsfzl.mybatis.binding.MapperRegistry;
import com.dsfzl.mybatis.mapping.MappedStatement;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: dsf
 * @description: 配置类
 * @date 2024/11/21 下午8:33
 */

public class Configuration {

    protected MapperRegistry mapperRegistry = new MapperRegistry(this);

    protected final Map<String, MappedStatement> mappedStatements = new HashMap<>();

    public void addMappers(String packageName){
        mapperRegistry.addMappers(packageName);
    }

    public <T> void addMapper(Class<T> type){
        mapperRegistry.addMapper(type);
    }

    public <T> T getMapper(Class<T> type, SqlSession sqlSession){
        return mapperRegistry.getMapper(type, sqlSession);
    }

    public boolean hasMapper(Class<?> type){
        return mapperRegistry.hasMapper(type);
    }

    public void addMappedStatement(MappedStatement ms){
        mappedStatements.put(ms.getId(),ms);
    }

    public MappedStatement getMappedStatement(String id){
        return mappedStatements.get(id);
    }
}
