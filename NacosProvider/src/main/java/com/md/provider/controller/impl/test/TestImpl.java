package com.md.provider.controller.impl.test;

import com.md.provider.controller.infra.test.TestInfra;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class TestImpl implements TestInfra {
    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String name;

    @Override
    public Map<String, Object> getProductList() {
        log.info("进入服务: " + name);
        Map<String, Object> map = new HashMap<>();
        map.put("state", 200);
        map.put("msg", "服务的端口号为" + port);
        return map;
    }
}
