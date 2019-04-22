package com.zhangwenit.mybatis.spring.boot.service;

import com.zhangwenit.mybatis.spring.boot.mapper.PersonMapper;
import com.zhangwenit.mybatis.spring.boot.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/4/22 5:51 PM
 * @Version 1.0
 **/
@Service
public class PersonService {

    private final PersonMapper personMapper;

    public PersonService(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    public List<Person> findAll() {
        return personMapper.findAll();
    }

}