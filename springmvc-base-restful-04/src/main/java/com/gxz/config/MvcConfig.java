package com.gxz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc//1.配置handlerMapping 2.配置handlerAdapter 3.配置json转换器
@ComponentScan({"com.gxz.controller","com.gxz.exception"})
public class MvcConfig implements WebMvcConfigurer {
//    //通过重写WebMvcConfigurer配置视图解析器
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        //指定视图解析器的前后缀
//        registry.jsp("/WEB-INF/views/",".jsp");
//    }

    //由于handlerMapping拦截所有请求，来匹配对应的handler，因此无法访问静态资源
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        //开启静态资源查找，如果handler未匹配则查找静态资源
        configurer.enable();//底层通过转发实现，转发能访问项目下的静态资源
    }
}
