package com.gxz.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//配置springmvc的拦截器
public class MyInterceptor implements HandlerInterceptor {
    //
    /**
     * 执行handler之前拦截：编码格式设置、登录保护、权限处理等（常用）
     * @param request 请求对象
     * @param response 响应对象
     * @param handler handler就是我们要调用的方法对象
     * @return  true 放行  false拦截
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截辣！！！");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    /**
     * 当handler执行完毕后执行的方法，没有拦截机制：对结果处理！ 敏感词汇检查
     * @param request 请求
     * @param response 响应
     * @param handler handler方法
     * @param modelAndView 返回的视图和共享域数据对象
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    /**
     * 整体处理完毕！！
     * @param request current HTTP request
     * @param response current HTTP response
     * @param handler the handler that started asynchronous=
     * @param ex  handler报错了 异常对象
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
