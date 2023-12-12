package com.gxz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //1.定义handler
    @RequestMapping("springmvc/hello")//对外访问的地址,到handlerMapping中注册
    @ResponseBody //直接返回字符串给前端,不经过视图解析器
    public String hello(){
        String s="hello springMVC!";
        System.out.println(s);
        return s;
    }

}
