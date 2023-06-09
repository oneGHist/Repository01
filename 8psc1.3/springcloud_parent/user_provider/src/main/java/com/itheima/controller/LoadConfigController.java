package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "config")
@RefreshScope  //用于启用刷新配置文件的信息
public class LoadConfigController {

    @Value("${test.message}")
    private String msg;

    /***
     * 读取配置文件中的数据
     * @return
     */
    @RequestMapping(value = "load")
    public String load(){
        return msg;
    }
}

