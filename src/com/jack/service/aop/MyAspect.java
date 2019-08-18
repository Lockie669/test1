package com.jack.service.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    //动态代理的增强方法--前置通知
    public void checkprivate(JoinPoint joinPoint){  //使用org.aspectj.lang.JoinPoint接口表示目标类连接点对象
        System.out.println ("checkprivate动态代理增强执行了============="+joinPoint);
    }

    //后置通知
    public void writeLog(Object result){ //返回一个结果
        System.out.println ("writeLog增强执行了============="+result);
    }

    //环绕通知
    public Object around(ProceedingJoinPoint joinPoint)  {

        Object[] args = joinPoint.getArgs ();//得到方法所需的参数
        System.out.println ("环绕 -----前置通知===========");
        Object proceed = null;
        try {
            //这个方法明确调用了切入点方法，没有的话会切入点方法不会执行，只会执行通知方法
            proceed = joinPoint.proceed (args);
            System.out.println ("环绕------后置通知===========");
            return proceed;
        } catch (Throwable throwable) {
            System.out.println ("环绕------异常通知===========");

            throw new RuntimeException ( throwable );
        }finally {

            System.out.println ("环绕------最终通知===========");
        }



    }

    //异常抛出通知
    public void afterthrows(Throwable ex)  {

        System.out.println ("异常抛出通知========"+ex.getMessage ());

    }

    public String after(){
        System.out.println ("最终通知========");
        return "密码";
    }
}
