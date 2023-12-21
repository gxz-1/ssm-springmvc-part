package com.gxz.controller;

import com.gxz.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//学习restful风格的uri和请求方式设计
@Controller
@ResponseBody
@RequestMapping("user")
public class UserController {
    //查找user集合
    @RequestMapping(method= RequestMethod.GET)
    public List<User> page(@RequestParam(required = false,defaultValue = "1") int page,
                           @RequestParam(required = false,defaultValue = "10") int size){
        //接收param参数 get方式
        return null;
    }

    //增加user
    @RequestMapping(method = RequestMethod.POST)
    public User save(@RequestBody User user){//接收json数据 post方式
        return user;
    }

    //查找user根据id
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public User detail(@PathVariable Integer id){//接收路径参数 get方式
        return null;
    }

    //更新user
    @RequestMapping(method = RequestMethod.PUT)
    public User update(@RequestBody User user){//接收json数据 put方式
        return user;
    }

    //删除根据id
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public Boolean delete(@PathVariable Integer id){
        return true;
    }

    //模糊查找user集合，根据关键字keyword
    @RequestMapping(value = "search",method = RequestMethod.GET)
    public List<User> search(String keyword,
                             @RequestParam(required = false,defaultValue = "1")int page,
                             @RequestParam(required = false,defaultValue = "10")int size){
        return null;
    }
}
