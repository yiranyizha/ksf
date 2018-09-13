package com.entity.com.dao;

import com.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class StudentDao {
    @Autowired
    HibernateTemplate hibernateTemplate;
    public StudentEntity findById(int id){
        StudentEntity studentEntity = hibernateTemplate.get(StudentEntity.class, 1);
        System.out.println(studentEntity);
        return studentEntity;
    }
    public void update(StudentEntity studentEntity){
   hibernateTemplate.saveOrUpdate(studentEntity);

    }

}
