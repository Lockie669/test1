package com.jack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("UserDAO") //相当于<bean id="UserDAO" class="com.jack.service.UserDAOImol">
public class UserDAOImol implements UserDAO {

    @Value ( "王动" ) //相当于<property name="name" value="王动"/> ，放置在属性上边的话就不用set方法
    private String name;
 /*   @Value ( "王动" ) //相当于<property name="name" value="王动"/>
    public void setName (String name) {
        this.name = name;
    }*/



    @Override
    public void save ( ) {
        System.out.println ("注解方式成功了==========="+name);
    }
}
