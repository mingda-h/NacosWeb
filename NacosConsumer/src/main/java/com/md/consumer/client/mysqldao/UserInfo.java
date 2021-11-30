package com.md.consumer.client.mysqldao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

// 微服务的调用
@FeignClient("cloud-NacosMysqlDao")
public interface UserInfo {
    @GetMapping("/mysql/sso/user/name")
    List<String> getAllUserName();

    @PostMapping("/mysql/sso/user/check")
    boolean checkUserName(@RequestParam("username") String username, @RequestParam("password") String password);
}
