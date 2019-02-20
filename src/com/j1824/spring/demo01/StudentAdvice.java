package com.j1824.spring.demo01;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class StudentAdvice {

    @Before("execution(* com.j1824.spring.demo01.StudentDao..*(..))")
    public void addAdvice() {
        System.out.println("添加学生 记录日志");
    }

}
