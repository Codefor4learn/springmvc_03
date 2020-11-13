package com.hz.service.Impl;

import com.hz.dao.StudentDao;
import com.hz.domain.Student;
import com.hz.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public int insertStudent(Student student) {

        return studentDao.insertStudent(student);
    }

    @Override
    public List<Student> selectStudents() {

        return studentDao.selectStudents();
    }
}
