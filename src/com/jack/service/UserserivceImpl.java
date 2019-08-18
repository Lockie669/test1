package com.jack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserserivceImpl implements UserService{

    //注入DAO
//    @Autowired //按照类型完成属性注入;要完成按名称属性注入，就要和@Qualifier同时使用完成
//    @Qualifier("UserDAO111")//跟UserDAO类的@Repository("UserDAO")不同会报错

    @Resource(name = "UserDAO")  //按照类型完成属性注入,按名称属性注入，等同于上面---开发一部用这种
    private UserDAO userDAO;

    @Override
    public void save ( ) {
        System.out.println ("userservice 方法执行了==========");
        userDAO.save ();//调用dao的方法
    }
}
