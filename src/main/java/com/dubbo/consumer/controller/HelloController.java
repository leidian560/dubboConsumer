package com.dubbo.consumer.controller;

import com.dubbo.provider.service.DubboServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author leidian560
 * @date 2018-09-06 19:34
 */
@Controller
@RequestMapping("hello/")
public class HelloController {
    @Autowired
    private DubboServiceProvider dubboServiceProvider;
    @RequestMapping("dubbo")
    @ResponseBody
    public String sayHello() {
        String s = dubboServiceProvider.sayHello("Dubbo学习之路");
        return s;
    }

}
