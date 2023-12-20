package com.gxz.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//AOP编程，处理全局异常
@ControllerAdvice
@ResponseBody //将输出直接返回,不走视图解析器
//@RestControllerAdvice = @ControllerAdvice + @ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)//处理算术异常
    public Object exceptionHandler1(ArithmeticException e){
        String message = e.getMessage();
        System.out.println("message = " + message);
        return message;
    }

    @ExceptionHandler(Exception.class)//处理所有异常，其他异常不匹配时走这个handler
    public Object exceptionHandler2(Exception e){
        String message = e.getMessage();
        System.out.println("message = " + message);
        return message;
    }
}
