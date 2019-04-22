package com.zhangwenit.mybatis.spring.boot.model;

import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/4/16 7:03 PM
 * @Version 1.0
 **/
public class Person {

    private Long id;

    private Integer sex;


    private String name;

    private String userId;
    /**
     * 使用numericScale可以指定保存时的小数位数
     */
    private Double price;


    public Person() {
    }

    public Person(@Param("id") Long id, @Param("sex") Integer sex, @Param("name") String name) {
        this.id = id;
        this.sex = sex;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", price=" + price +
                '}';
    }
}