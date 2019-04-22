package com.zhangwenit.mybatis.spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zhangwenit.mybatis.spring.boot.mapper")
public class MybatisSpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringBootDemoApplication.class, args);
    }

}
