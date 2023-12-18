package com.gxz.json;

import com.gxz.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("json")
@ResponseBody//将user通过handlerApapter转化为json，并直接返回，不通过视图解析器
//@RestController = @Controller+@ResponseBody
public class jsonController {

    @RequestMapping("data")
    public User data(){
        User user = new User();
        user.setName("Tom");
        user.setAge(18);
        return user;
    }

    @RequestMapping("data2")
    public List<User> dataList(){
        User user1 = new User();
        user1.setName("Tom");
        user1.setAge(18);
        User user2 = new User();
        user2.setName("Cat");
        user2.setAge(26);
        ArrayList<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
}
