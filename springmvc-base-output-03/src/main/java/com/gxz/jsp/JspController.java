package com.gxz.jsp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("jsp")
public class JspController {

    @RequestMapping(value = "index",method = RequestMethod.GET)
    //@ResponseBody 这个注解表示不经过视图解析器，需要去掉
    public String index(HttpServletRequest request){
        request.setAttribute("data","hello jsp!!!!");//设置共享域中data的值
        System.out.println("JspController.index");
        return "index";//找名为index的视图，在MvcConfig中已经指定了视图的前缀后缀
    }

    //转发（只能是项目内的资源）
    @RequestMapping(value = "forward",method = RequestMethod.GET)
    public String forward(){
        //springmvc提供的转发方案：“forward:地址”，不加forward:会走视图解析器
        return "forward:/jsp/index";
    }

    //重定向（可以是项目外）
    @RequestMapping(value = "redirect",method = RequestMethod.GET)
    public String redirect(){
        //重定向：“redirect:地址”
        //return  "redirect:/jsp/index";
        return "redirect:http://www.baidu.com";
    }
}
