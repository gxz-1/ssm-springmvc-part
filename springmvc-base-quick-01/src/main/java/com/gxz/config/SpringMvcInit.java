package com.gxz.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//代替web.xml文件:可以被web项目加载,会初始化ioc容器,会设置dispatcherServlet的地址
public class SpringMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    //用于创建service和mapper层的ioc容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    //设置项目的ioc配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};//传入ioc容器的配置类
    }
    //配置springmvc内部自带servlet的访问地址
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
