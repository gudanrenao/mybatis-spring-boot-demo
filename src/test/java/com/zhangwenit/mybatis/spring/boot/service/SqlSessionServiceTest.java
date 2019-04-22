package com.zhangwenit.mybatis.spring.boot.service;

import com.zhangwenit.mybatis.spring.boot.MybatisSpringBootDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@SpringBootTest(classes = MybatisSpringBootDemoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SqlSessionServiceTest {

    @Autowired
    private SqlSessionService sqlSessionService;

    @Test
    public void selectDemo() {
        sqlSessionService.selectDemo();
    }
}