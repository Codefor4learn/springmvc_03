package com.hz.controller;

import com.hz.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InterceptorController {

    @RequestMapping("testInterceptor")
    public ModelAndView testInterceptor(Student student){

        System.out.println("执行InterceptorController的testInterceptor方法============");
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",student.getName());
        mv.addObject("email",student.getEmail());
        mv.addObject("age",student.getAge());
        mv.addObject("aaa",null);

        mv.setViewName("forward:/WEB-INF/forward/showstudent.jsp");

        return mv;
    }
}
