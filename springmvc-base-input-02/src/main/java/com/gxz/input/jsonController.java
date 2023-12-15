package com.gxz.input;

import com.gxz.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("jsondata")
@ResponseBody
public class jsonController {
    //设置@RequestBody注解，表示接收json格式
    //报415异常不支持数据类型,原因：java原生api只支持path和param
    //解决：1.导入json处理的依赖 2.handlerApapter配置json转换器
    public String data(@RequestBody Person person){
        System.out.println("person = " + person);
        return person.toString();
    }
}
