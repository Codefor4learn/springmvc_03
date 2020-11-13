package com.hz.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/*
    集中管理Controller对象，如验证登录，记录日志
 */
// 拦截器对象
public class MyInterceptor2 implements HandlerInterceptor {

    private long btime = 0;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        btime = System.currentTimeMillis();
        System.out.println("拦截器MyInterceptor的preHandle方法=222222222");
        //request.getRequestDispatcher("tips.jsp").forward(request,response);
        return true;
    }

    /*
        主要对原来的结果进行二次处理
    *   handler ：被拦截的处理器对象 Controlller
    *   modelAndView：处理器的返回值 （可以被修改）
    * */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        if(modelAndView != null){
            modelAndView.addObject("date",new Date());
            modelAndView.setViewName("other");
        }
        System.out.println("拦截器MyInterceptor的postHandle方法=222222222");
    }

    /*
    *   1.返回结果已经发送给用户，之后执行
    *   2.一般做资源回收
    * */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        long etime = System.currentTimeMillis();

        System.out.println("拦截器MyInterceptor的afterCompletion方法=222222222");
        //System.out.println("从preHandle到afterCompletion的执行时间：" + (etime - btime));
    }
}
