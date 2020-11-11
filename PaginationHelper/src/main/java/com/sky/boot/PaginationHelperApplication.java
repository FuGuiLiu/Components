package com.sky.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan(value = "com.sky.boot.dao")
public class PaginationHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaginationHelperApplication.class, args);

    }

}
