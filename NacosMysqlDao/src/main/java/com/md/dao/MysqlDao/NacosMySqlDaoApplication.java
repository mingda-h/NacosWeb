package com.md.dao.MysqlDao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosMySqlDaoApplication {
    public static void main(String[]args){
        SpringApplication.run(NacosMySqlDaoApplication.class,args);
    }
}
