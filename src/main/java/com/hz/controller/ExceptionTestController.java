package com.hz.controller;

import com.hz.domain.Student;
import com.hz.exception.AgeException;
import com.hz.exception.MyUserException;
import com.hz.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionTestController {

    /*异常处理步骤
    1.新建 maven web项目
    2.加入依赖3新建一个自定义异常类 MyUserEXception，再定义它的子类 NameException, AgeException
    4.在 controller抛出 Name Exception, AgeException
    5.创建一个普通类，作用全局异常处理类
    1）在类的上面加入@ControllerAdvice
    2）在类中定义方法，方法的上面加入@ ExceptionHand1er
    6.创建处理异常的视图页面7创建 springmvc的配置文件
    1）组件扫描器，扫描@ Controlle注解
    2）组件扫描器，扫描@ConrtrollerAdvice所在的包名
    3）声明注解驱动*/

    @RequestMapping("doTestException")
    public ModelAndView doSome(String name, Integer age) throws MyUserException {

        ModelAndView mv = new ModelAndView();
        // 根据请求参数抛出异常
        if(!"hz".equals(name)){
            throw new NameException("姓名不正确");
        }

        if(age == null || age > 80){
            throw new AgeException(("年龄太大"));
        }


        mv.addObject("name",name);
        mv.addObject("age",age);

        mv.setViewName("show");
        return mv;
    }
}
