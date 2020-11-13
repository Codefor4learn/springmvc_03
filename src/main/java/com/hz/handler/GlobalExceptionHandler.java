package com.hz.handler;

import com.hz.exception.AgeException;
import com.hz.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/*控制器增强（给控制器增加功能，现在是增强异常处理功能）
    需要扫描包 */
// 全局异常处理器
@ControllerAdvice
public class GlobalExceptionHandler {

    // 定义方法 和被处理方法一样 具有什么参数什么返回值 这个方法就具有
    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception ex){
        // 处理名字异常
        /*
            1.需要记录异常记录（数据库，日志文件）
            2.发送通知，如邮件、短信、微信发送给相关人员
            3.给用户友好提示。异常页面
         */
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","姓名必须是hz，其他的不能访问");
        mv.addObject("ex",ex);

        mv.setViewName("nameError");
        return mv;
    }

    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception ex){

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","年龄太大或为空");
        mv.addObject("ex",ex);

        mv.setViewName("ageError");
        return mv;
    }

    // 处理未捕获异常  最简单的是只处理这一个异常
    @ExceptionHandler
    public ModelAndView doOtherException(Exception ex){

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","发生未知异常");
        mv.addObject("ex",ex);

        mv.setViewName("defaultError");
        return mv;
    }
}
