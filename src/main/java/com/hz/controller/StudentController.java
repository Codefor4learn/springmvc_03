package com.hz.controller;

import com.hz.domain.Student;
import com.hz.service.StudentService;
import com.sun.deploy.net.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {

    @Resource
    private StudentService studentService;

    // 注册学生
    @RequestMapping("addStudent")
    public ModelAndView addStudent(HttpServletRequest request , Student student){

        String tips = "注册失败";
       /* String name = request.getParameter("name");
        String email = request.getParameter("email");
        Integer age = Integer.valueOf(request.getParameter("name"));*/
       System.out.println(student);
       int nums = studentService.insertStudent(student);
       if(nums > 0){
           // 注册成功
           tips = "学生【" + student.getName() + "】注册成功";
       }

       ModelAndView mv = new ModelAndView();
       mv.addObject("tips",tips);

       mv.setViewName("result");
       return mv;
    }

    // 查询学生
    @RequestMapping("queryStudent")
    @ResponseBody
    public List<Student> queryStudent(){

        // 参数检查
        List<Student> studentList = studentService.selectStudents();

        return studentList;
    }
}
