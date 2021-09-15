package com.zsk.demospringbootstartertest.controller;

import com.zsk.starter.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : zsk
 * @CreateTime : 2021-09-15   21:46
 */
@RestController
@RequestMapping("/test")
public class SpringBootStarterTestController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo")
    public void demo(){
        String result = demoService.getWorkingMsg();
        System.out.println(result);
    }
}
