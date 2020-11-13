package com.hz.controller;

import com.hz.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForwardRedirectController {

    // 重定向和转发的共同特点，都不与视图解析器一同工作
    // 转发可以访问到WEB-INF下的内容，而重定向不可以直接访问到内容，需要通过访问控制器

    // 转发
    // 使用时机，存在视图解析器，但是想要的页面不在视图解析器的目录下
    @RequestMapping("doForward")
    public ModelAndView testForward(Student student){

        ModelAndView mv = new ModelAndView();
        mv.addObject("name",student.getName());
        mv.addObject("email",student.getEmail());
        mv.addObject("age",student.getAge());

        mv.setViewName("forward:/WEB-INF/forward/showstudent.jsp"); //不在jsp文件夹下

        return mv;
    }

    // 重定向有两个request作用域
    @RequestMapping("doRedirect")
    public ModelAndView testRedirect(Student student){

        ModelAndView mv = new ModelAndView();
        mv.addObject("name",student.getName());
        mv.addObject("email",student.getEmail());
        mv.addObject("age",student.getAge());

        // 重定向的时候，将model里面的数据当作参数进行请求
        mv.setViewName("redirect:listStudent.jsp"); //不在jsp文件夹下

        return mv;
    }

    @RequestMapping("doRedirect2")
    public ModelAndView testRedirect2(Student student){

        System.out.println("第一次重定向");
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",student.getName());
        mv.addObject("email",student.getEmail());
        mv.addObject("age",student.getAge());

        mv.setViewName("redirect:doRedirect3");

        return mv;
    }

    @RequestMapping("doRedirect3")
    public ModelAndView testRedirect3(Student student){

        // 这里的多余操作是为了表示，这里能取到重定向过来的参数
        System.out.println("第二次重定向");
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",student.getName());
        mv.addObject("email",student.getEmail());
        mv.addObject("age",student.getAge());

        mv.setViewName("forward:/WEB-INF/forward/showstudent.jsp");

        return mv;
    }
}
