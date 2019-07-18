package com.hand.exam1.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

@Aspect
@Component
public class LogAop {


    @Before("execution(* *..*Controller.*(..)) && @annotation(logno)")/*&& @annotation(logno)*/
    public Object beforeinsert(ProceedingJoinPoint point){
        ServletRequestAttributes attributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();//获取request对象
        MethodSignature methodSignature= (MethodSignature) point.getSignature();//获取方法标签
        Method method = methodSignature.getMethod();//获取某类中加注解的方法
        logno logo = method.getAnnotation(logno.class);//获取注解类

        System.out.println("某人开始"+logo.operaterType()+"操作");

        Object result=null;
        try {
            result = point.proceed();
        } catch (Throwable throwable) {
        }
        return result;
    }

    @Before("execution(* *..*Controller.*(..)) && @annotation(logno)")/*&& @annotation(logno)*/
    public Object afterinsert(ProceedingJoinPoint point){
        ServletRequestAttributes attributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();//获取request对象
        MethodSignature methodSignature= (MethodSignature) point.getSignature();//获取方法标签
        Method method = methodSignature.getMethod();//获取某类中加注解的方法
        logno logo = method.getAnnotation(logno.class);//获取注解类

        System.out.println("某人开始"+logo.operaterType()+"操作");

        Object result=null;
        try {
            result = point.proceed();
        } catch (Throwable throwable) {
        }
        return result;
    }
}
