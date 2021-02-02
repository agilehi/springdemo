package com.suftz.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 22:47
 */
//@Component
//@Aspect//标识该类为增强类，提供切入方法
//@Order(1)//如果被增强类有多个增强的类，则需要设置优先级，数字越小优先级越高
public class UserDaoProxy {
    //抽取的公共切入点
    @Pointcut(value="execution(* com.suftz.dao.*.add(..))")
    public void pointAdd(){

    }
    //@Before(value = "execution(* com.suftz.dao.*.add(..))")
    @Before(value = "pointAdd()")
    public void before(){
        System.out.println("userDaoProxy.....前置通知...");
    }

    @AfterReturning(value = "pointAdd()")
    public void afterReturning(){
        System.out.println("userDaoProxy.....后置(返回)通知...");
    }

    @After(value="pointAdd()")
    public void after(){
        System.out.println("userDaoProxy.....最终通知...");
    }
    @AfterThrowing(value="pointAdd()")
    public void afterThrowing(){
        System.out.println("userDaoProxy.....异常通知...");
    }
    @Around(value = "pointAdd()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("userDaoProxy.....环绕之前....");
        //执行被增强的方法
        proceedingJoinPoint.proceed();
        System.out.println("userDaoProxy.....环绕之后....");
    }
}
/**
 * 正确
 userDaoProxy.....环绕之前...
 userDaoProxy.....前置通知...
 userDao add...
 userDaoProxy.....环绕之后...
 userDaoProxy.....最终通知...
 userDaoProxy.....后置(返回)通知...
 *
 * 错误
 userDaoProxy.....环绕之前...
 userDaoProxy.....前置通知...
 userDaoProxy.....最终通知...
 userDaoProxy.....异常通知...
 * */

