package com.md.nacoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NacosConfigApplication {
    public static void main(String[]args){
        ConfigurableApplicationContext context = SpringApplication.run(NacosConfigApplication.class,args);
//          从environment中读取配置
//          String useLocalCache = context.getEnvironment().getProperty("useLocalCache");
//          System.out.println(useLocalCache);
    }
}
