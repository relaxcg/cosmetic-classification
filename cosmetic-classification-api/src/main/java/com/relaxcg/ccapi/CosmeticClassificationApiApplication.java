package com.relaxcg.ccapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.relaxcg.ccapi.repository.dao")
@SpringBootApplication
public class CosmeticClassificationApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CosmeticClassificationApiApplication.class, args);
    }

}
