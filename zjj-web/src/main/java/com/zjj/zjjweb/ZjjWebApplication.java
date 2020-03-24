package com.zjj.zjjweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zjj"})
@EnableJpaRepositories(basePackages = "com.zjj.zjjdao.dao")
@EntityScan(basePackages = "com.zjj.zjjentity.domain")
public class ZjjWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZjjWebApplication.class, args);
    }

}
