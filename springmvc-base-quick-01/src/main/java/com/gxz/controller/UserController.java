package com.gxz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("user")
public class UserController {

    /**
     * RequestMapping
     * 0. 可以不以/斜杠开头
     * 1. 可以写多个地址 {"/a","/b"}
     * 2. 支持模糊匹配：/user/* 匹配一层 /user/** 匹配多层
     * 3. 可以在类上配置，与方法上的进行拼接(@RequestMapping传入空参就是访问类上的地址)
     * 4. get、post请求方式限定：method={RequestMethod.GET/POST} 或 使用@GetMapping、@PostMapping
     * 注：四种请求方式：get、post、delete、put
     */

    @RequestMapping(value = {"a/*","/springmvc"},method = RequestMethod.GET)
    public String login(){
        System.out.println("login...");
        return null;
    }
}
