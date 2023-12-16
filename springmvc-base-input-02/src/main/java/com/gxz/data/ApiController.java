package com.gxz.data;


import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//学习获取原生api对象：直接在形参中声明
@Controller
public class ApiController {
    //通过自动装配获取ServletContext，作用：1.最大的配置文件 2.全局最大共享域 3.核心api
    @Autowired
    private ServletContext servletContext;

    @RequestMapping("api")
    public void data(HttpServletResponse response,
                       HttpServletRequest request,
                       HttpSession session){
        //正常使用原生api
    }
}
