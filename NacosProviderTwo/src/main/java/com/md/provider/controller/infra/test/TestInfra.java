package com.md.provider.controller.infra.test;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

public interface TestInfra {
    @GetMapping("/product/getProductList")
    Map<String, Object> getProductList();
}
