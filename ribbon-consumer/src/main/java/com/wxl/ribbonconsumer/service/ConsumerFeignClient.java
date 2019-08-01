package com.wxl.ribbonconsumer.service;

import com.wxl.ribbonconsumer.fallback.ConsumerFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 名称和服务名一致,服务失效的话则调用本地方法 降级处理
@FeignClient(value = "provider",fallback = ConsumerFeignFallBack.class)
public interface ConsumerFeignClient {
    // 路由参数和服务中的方法一致
    @RequestMapping(value = "/learn", method = RequestMethod.GET)
    String getMsg();
}
