package com.gxz.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public class User {
    //1.添加JSR 303校验注解
    private Integer id;
    @NotBlank //字符串非空
    private String name="";
    @Min(1)//最小值为1
    private Integer age=-1;
    @Length(min = 6)//密码最小长度为6
    private String password;
    @Email//要求符合邮箱地址
    private String email;
    //2.在controller中形参User前添加@Validated
    //3.BindingResult：接收错误检验信息，自定义返回前端的结果
//    public Object save(@Validated @RequestBody User user,
//                       //在实体类参数和 BindingResult 之间不能有任何其他参数, BindingResult可以接受错误信息,避免信息抛出!
//                       BindingResult result){
//        //判断是否有信息绑定错误! 有可以自行处理!
//        if (result.hasErrors()){
//            System.out.println("错误");
//            String errorMsg = result.getFieldError().toString();
//            return errorMsg;
//        }
//        //没有,正常处理业务即可
//        System.out.println("正常");
//        return user;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
