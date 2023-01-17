package com.neph.dbops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DbOpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbOpsApplication.class, args);
    }

}
