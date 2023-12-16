package com.gxz.param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.gxz.pojo.User;

import java.util.List;

//学习param方式传参
@Controller
@RequestMapping("param")
public class ParamController {
    //1.直接接收前端参数:前端param名称与形参名一致
    @RequestMapping("data")
    @ResponseBody
    public String data(String name,Integer age){
        //注意，未接收到参数时为null
        System.out.println("name = " + name + ", age = " + age);
        return "name = " + name + ", age = " + age;
    }
    //2.注解指定：@RequestParam中value自定义前端名称，required表示是否必须传递这个参数，defaultValue指定不传递时的默认值
    @RequestMapping("data1")
    @ResponseBody
    public String data1(@RequestParam(value = "num") String count,
                        @RequestParam(required = false,defaultValue = "-1") int page){
        System.out.println("count = " + count + ", page = " + page);
        return "count = " + count + ", page = " + page;
    }
    //3.一名多值，如animal=cat&animal=dog：用集合接值,必须加@RequestParam
    @RequestMapping("data2")
    @ResponseBody
    public String data2(@RequestParam List<String> animal){
        System.out.println("animal = " + animal);
        return "animal = " + animal;
    }
    //4.实体类对象接值（重点）：准备一个包含对应属性get和set的类即可
    //注：1.前端名称不可自定义 2.默认值在实体类中赋值
    @RequestMapping("data3")
    @ResponseBody
    public String data3(User user){
        System.out.println("user = " + user);
        return user.toString();
    }
}
