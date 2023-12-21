package com.gxz.config;

import com.gxz.interceptor.MyInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

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

    //添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //0.先声明的拦截器优先级高
        //1.拦截全部请求
        registry.addInterceptor(new MyInterceptor());
        //2.指定地址拦截
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/user/*");//*任意一层 **任意多层
        //3.指定的基础上排除
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/user/*").excludePathPatterns("/user/search");//*任意一层 **任意多层
    }
}
