package com.example.gradel.hibernate.service.impl;

import com.example.gradel.hibernate.domain.Student;
import com.example.gradel.hibernate.repository.StudentRepository;
import com.example.gradel.hibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
@Transactional(rollbackOn = Exception.class)
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentRepository studentRepository;

    @Override
    public Student getStudent() {
        return studentRepository.getStudent();
    }
}
