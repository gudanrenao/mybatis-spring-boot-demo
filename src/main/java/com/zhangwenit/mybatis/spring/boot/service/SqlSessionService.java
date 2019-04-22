package com.zhangwenit.mybatis.spring.boot.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/4/22 9:30 PM
 * @Version 1.0
 **/
@Service
public class SqlSessionService {

    private final SqlSession sqlSession;

    public SqlSessionService(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public void selectDemo(){
        Object selectOne = sqlSession.selectOne("com.zhangwenit.mybatis.spring.boot.mapper.PersonMapper.selectById", 1L);
        System.out.println(selectOne);
    }
}