package com.gxz.data;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//获取cookie数据
@Controller
@RequestMapping("cookie")
@ResponseBody
public class CookieController {

    @RequestMapping("data")
    public String data(@CookieValue(value = "cookieName") String value){
        //通过@CookieValue注解接收key为"cookieName"的cookie
        System.out.println("value = " + value);
        return "value = " + value;
    }

    @RequestMapping(value = "save",method = RequestMethod.GET)
    public String save(HttpServletResponse response){
        //生成cookie并返回前端
        Cookie cookie=new Cookie("cookieName","fsdav456dh156");
        response.addCookie(cookie);
        return "ok";
    }


}
