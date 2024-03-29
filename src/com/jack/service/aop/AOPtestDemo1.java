package com.jack.service.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AOPtestDemo1 {

    @Resource(name = "studentService")
//    @Autowired
    private StudentService studentService;

    @Test
    public void test1 ( ) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext ( "applicationContext.xml" );
//        StudentService studentService = applicationContext.getBean ( "StudentService", StudentService.class );
        this.studentService.save ();
        this.studentService.find ();
        this.studentService.update ();
        this.studentService.delete ();
    }
}
