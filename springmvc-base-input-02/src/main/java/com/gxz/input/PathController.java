package com.gxz.input;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//学习路径传参
@Controller
@RequestMapping("path")
@ResponseBody
public class PathController {

    @RequestMapping("{account}/{password}")//设置动态路径，并在形参中接收
    //设置@PathVariable注解，表示接收路径参数而不是param
    public String login(@PathVariable(value = "account") String name,@PathVariable(required = false) String password){
        System.out.println("name = " + name + ", password = " + password);
        return "name = " + name + ", password = " + password;
    }
}
