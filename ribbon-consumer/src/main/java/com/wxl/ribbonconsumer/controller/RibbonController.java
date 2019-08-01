package com.wxl.ribbonconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wxl.ribbonconsumer.config.JDBCConfig;
import com.wxl.ribbonconsumer.service.ConsumerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
    @Autowired
    private ConsumerFeignClient consumerFeignClient;

    @Autowired
    private JDBCConfig jdbcConfig;

    @GetMapping("/consumer")
    public String getMsg() {
        return consumerFeignClient.getMsg()+"\n获取到配置\n"+jdbcConfig.toString();
    }
}
