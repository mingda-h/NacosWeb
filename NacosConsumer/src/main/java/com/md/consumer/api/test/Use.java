package com.md.consumer.api.test;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.md.consumer.client.TestP;
import com.md.consumer.client.mysqldao.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class Use {
    @Value("${server.port}")
    private String port;
    @Autowired
    private TestP testP;
    @Autowired
    private UserInfo userInfo;

    @GetMapping(value = "/consumer/getProductList", produces = {"application/json;charset=UTF-8"})
    public Map<String, Object> getProductList() {
        log.info("进入conmuser服务");
        Map<String, Object> map = testP.getProductList();
        return map;
    }

    @GetMapping(value = "/consumer/sso/user/name", produces = {"application/json;charset=UTF-8"})
    public List<String> getAllUserName() {
        log.info("进入conmuser服务");
        List<String> list = userInfo.getAllUserName();
        return list;
    }
    @PostMapping(value = "/login",produces = {"application/json;charset=UTF-8"})
    public boolean login(@RequestParam("username")String username,@RequestParam("password")String password) {
        log.info("进入conmuser服务");
        boolean result = userInfo.checkUserName(username,password);
        return result;
    }
//    @GetMapping(value = "/login/test",produces = {"application/json;charset=UTF-8"})
//    public boolean logintest(@RequestParam("username")String username) {
//        log.info("进入conmuser服务");
//        return true;
//    }
    // 限流操作,在ruleConfig中配置限流规则
    @SentinelResource(value = "hello",blockHandler = "blockHandlerHello")
    @GetMapping("/say")
    public String hello(){
        return "hello md";
    }

    public String blockHandlerHello(BlockException be){
        return "被限流了";
    }

    @GetMapping("/dash")
    public String dash(){
        return "hello dash";
    }
}
