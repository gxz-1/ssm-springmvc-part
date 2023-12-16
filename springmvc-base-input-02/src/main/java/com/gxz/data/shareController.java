package com.gxz.data;

//学习共享域对象获取

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("share")
@ResponseBody
public class shareController {

    //1.使用原生api获取共享域
    private ServletContext servletContext;
    public String data(HttpServletRequest request, HttpSession session){
        return "";
    }

    //2.springmvc提供的方法(了解)
    //model modelMap modelAndView
    public ModelAndView data1(Model model, ModelMap modelMap){
        model.addAttribute("key","value");
        modelMap.put("key","value");

        ModelAndView view = new ModelAndView();
        view.addObject("key","value");
        view.setViewName("设置视图名 页面名称");
        return view;
    }

}
