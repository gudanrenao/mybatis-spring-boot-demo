package com.zhangwenit.mybatis.spring.boot.service;

import com.zhangwenit.mybatis.spring.boot.MybatisSpringBootDemoApplication;
import com.zhangwenit.mybatis.spring.boot.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest(classes = MybatisSpringBootDemoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Test
    public void findAll() {
        List<Person> list = personService.findAll();
        System.out.println(list.size() + "----" + list);
    }
}