package com.hz.service;

import com.hz.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    int insertStudent(Student student);

    List<Student> selectStudents();
}
