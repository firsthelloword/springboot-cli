package com.zyk.cli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.zyk.cli")
public class CliApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CliApiApplication.class, args);
    }

}
