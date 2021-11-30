package com.md.consumer.client.findserver;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindServer {
//    @NacosInjected
//    private NamingService namingService;
//    @GetMapping("/consumer/discovery")
//    public List<Instance> getAllInstances(@RequestParam String serviceName)throws NacosException {
//        return namingService.getAllInstances(serviceName);
//    }
}
