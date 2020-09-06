package com.example.gradel.hibernate.repository.impl;

import com.example.gradel.hibernate.domain.Student;
import com.example.gradel.hibernate.repository.StudentRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;


    @Override
    public Student getStudent() {
        List<Student> list = sessionFactory.getCurrentSession().createCriteria(Student.class)
               /* .add(Restrictions.ge("age", 10))*/
                .list();
        if(list == null){
            return null;
        }
        return list.get(0);
    }
}
