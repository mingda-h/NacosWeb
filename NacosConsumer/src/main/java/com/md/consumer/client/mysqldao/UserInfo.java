package com.md.consumer.client.mysqldao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@FeignClient("cloud-NacosMysqlDao")
public interface UserInfo {
    @GetMapping("/mysql/sso/user/name")
    List<String> getAllUserName();
}
