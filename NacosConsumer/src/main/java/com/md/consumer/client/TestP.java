package com.md.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient("cloud-NacosProvider")
public interface TestP {
    @GetMapping("/product/getProductList")
    Map<String, Object> getProductList();

}
