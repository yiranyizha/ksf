package com.entity.com.dao;

import com.entity.StudentEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class StudentDaoTest {
    @Autowired
    HibernateTemplate hibernateTemplate;


    @Test
    public void findById() {
        StudentEntity studentEntity = hibernateTemplate.get(StudentEntity.class, 1);
        System.out.println(studentEntity);

    }

    @Test
    public void insert() {
        /*hibernateTemplate.saveOrUpdate();*/
    }
}