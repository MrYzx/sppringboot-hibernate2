package com.example.gradel.hibernate.controller;

import com.example.gradel.hibernate.domain.Student;
import com.example.gradel.hibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/Student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/GetInfo")
    public Student getInfo() {
        return studentService.getStudent();
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "test...";
    }
}
