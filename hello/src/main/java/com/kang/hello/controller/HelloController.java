package com.kang.hello.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: CHEN
 * @CreateTime: 2021/2/22
 * @Company:
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){

        return "hello,world";
    }
}
