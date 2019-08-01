package com.wxl.ribbonconsumer.fallback;

import com.wxl.ribbonconsumer.service.ConsumerFeignClient;
import org.springframework.stereotype.Component;

@Component
public class ConsumerFeignFallBack implements ConsumerFeignClient {

    @Override
    public String getMsg() {
        return "服务失效，降级处理";
    }
}
