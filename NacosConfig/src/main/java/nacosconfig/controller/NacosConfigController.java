package nacosconfig.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@NacosPropertySource(dataId = "nacos-config-example",autoRefreshed = true)
@RestController
public class NacosConfigController {
    @NacosValue(value = "${info:Local Hello World}",autoRefreshed = true)
    private String info;
    @GetMapping("/config")
    public String get(){
        return info;
    }
}
