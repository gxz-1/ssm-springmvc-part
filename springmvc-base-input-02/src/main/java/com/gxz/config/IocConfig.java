package com.gxz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@EnableWebMvc
//作用：1.添加HandlerMapping 2.添加HandlerAdapter 3.配置json数据转换器
@Configuration
@ComponentScan({"com.gxz.param","com.gxz.data"})
public class IocConfig {
//    @Bean
//    public RequestMappingHandlerMapping handlerMapping(){
//        return new RequestMappingHandlerMapping();
//    }
//    @Bean
//    public RequestMappingHandlerAdapter handlerAdapter(){
//        return  new RequestMappingHandlerAdapter();
//    }
}
