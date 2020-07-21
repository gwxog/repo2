package cn.itcast.aop_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PersonAdvice {
    public void writeLog(){
        System.out.println("记录日志");
    }

    // 前置
    @Before("execution(* cn.itcast.aop_annotation..add*(..))")
    public void before(){
        System.out.println("前面记录日志");
    }

    // 后置
    @AfterReturning("execution(* cn.itcast.aop_annotation..del*(..))")
    public void afterReturning(){
        System.out.println("后面记录日志");
    }

    // 异常
    @AfterThrowing("execution(* cn.itcast.aop_annotation..update*(..))")
    public void throwable(){
        System.out.println("异常记录日志");
    }

    // 环绕
    @Around("execution(* cn.itcast.aop_annotation..query*(..))")
    public void  around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕增强前");
        joinPoint.proceed();  //切到原来的目标方法,进行执行
        System.out.println("环绕增强后");
    }

    // 最终
    @After("execution(* cn.itcast.aop_annotation..bat*(..))")
    public void  after(){
        System.out.println("最终记录日志");
    }
}
