package com.md.msyqldao.mybatis.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Test {
    @GetMapping("/hi")
    public String getTest(){
        return "hello !";
    }
}
