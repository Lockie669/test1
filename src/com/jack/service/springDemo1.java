package com.jack.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class springDemo1 {
    /**
     * 普通属性注解
     */
    @Test
    public void test1 ( ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext ( "applicationContext.xml" );
        UserDAO userDAO = (UserDAO) applicationContext.getBean ( "UserDAO" );
        userDAO.save ();

    }

    /**
     * 对象属性名称类型注入
     */
    @Test
    public void test2 ( ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext ( "applicationContext.xml" );
        UserService userService = (UserService) applicationContext.getBean ( "UserService" );
        userService.save ();

    }

    /**
     * 生命周期方法
     */
    @Test
    public void test3 ( ) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ( "applicationContext.xml" );
        CustomerService customerService1 = (CustomerService) applicationContext.getBean ( "CustomerService" );
        CustomerService customerService2 = (CustomerService) applicationContext.getBean ( "CustomerService" );
        //会初始化两次，销毁不了，因为不知道销毁哪个
        System.out.println ( customerService1 );
        System.out.println ( customerService2 );
        customerService1.save ();
        applicationContext.close ();

    }
}
