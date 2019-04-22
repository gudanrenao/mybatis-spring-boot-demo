package com.zhangwenit.mybatis.spring.boot.mapper;

import com.zhangwenit.mybatis.spring.boot.model.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/4/22 5:29 PM
 * @Version 1.0
 **/
@Mapper
public interface PersonMapper {

    @Select("select * from person")
    List<Person> findAll();
}
