package com.jack.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("CustomerService")
//@Scope("singleton")
@Scope("prototype")
public class CustomerService {

    @PostConstruct //相当于init-method
    public void init(){
        System.out.println ("init==========");
    }
    public void save(){
        System.out.println ("save===============");
    }
    @PreDestroy //相当于destroy-method
    public void destroy(){

        System.out.println ("git主干合并");
        System.out.println ("分支练习");
        System.out.println ("Dev的子分支");
        System.out.println ("hhhhhhhhhhhhhhhhhhhhhhhhhhh");
        System.out.println ("gggggggggggggggggaaaaaaaaaaaaaaaaaaaa");

    }
}
