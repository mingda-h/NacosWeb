package com.md.consumer.api.test;

import com.md.consumer.client.TestP;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class Use {
    @Value("${server.port}")
    private String port;
    @Autowired
    private TestP testP;

    @GetMapping(value = "/consumer/getProductList",produces = { "application/json;charset=UTF-8" })
    public Map<String, Object> getProductList() {
        log.info("进入conmuser服务");
        Map<String, Object> map = testP.getProductList();
        return map;
    }
}
