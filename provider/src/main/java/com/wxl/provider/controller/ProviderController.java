package com.wxl.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {


    @RequestMapping(value = "/learn" , method = RequestMethod.GET)
    public String learnService(){

        return "成功访问服务";
    }
}
