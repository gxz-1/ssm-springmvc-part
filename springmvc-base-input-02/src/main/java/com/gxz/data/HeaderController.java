package com.gxz.data;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//学习获取请求头数据
@ResponseBody
@RequestMapping("header")
@Controller
public class HeaderController {
    @RequestMapping
    public String data(@RequestHeader("Host") String host,@RequestHeader("User-Agent") String ua){
        //通过@RequestHeader注解指定请求头中的key，获取对应的value
        System.out.println("host = " + host + ", ua = " + ua);
        return "host = " + host + ", ua = " + ua;
    }
}
