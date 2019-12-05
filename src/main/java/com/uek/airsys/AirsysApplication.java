package com.uek.airsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.uek.airsys.mapper"})
public class AirsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirsysApplication.class, args);
    }

}
