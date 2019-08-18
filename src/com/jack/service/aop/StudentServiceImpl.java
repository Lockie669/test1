package com.jack.service.aop;

public class StudentServiceImpl implements StudentService {
    @Override
    public void save ( ) {
        System.out.println ("save");
    }

    @Override
    public void find ( ) {
        System.out.println ("find");
//        int a =3/0;
    }

    @Override
    public void update ( ) {
        System.out.println ("update");
    }

    @Override
    public String delete ( ) {
        System.out.println ("delete");
        return "哈哈";
    }
}
