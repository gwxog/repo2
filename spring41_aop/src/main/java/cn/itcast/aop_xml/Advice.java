package cn.itcast.aop_xml;

import org.aspectj.lang.ProceedingJoinPoint;

//增强类
public class Advice {

    public void writeLog(){
        System.out.println("记录日志");
    }

    public void before(){
        System.out.println("前面记录日志");
    }

    public void afterReturning(){
        System.out.println("后面记录日志");
    }

    public void throwable(){
        System.out.println("异常记录日志");
    }

    //..暂定
    public void  around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕增强前");
        joinPoint.proceed();  //切到原来的目标方法,进行执行
        System.out.println("环绕增强后");
    }

    public void  after(){
        System.out.println("最终记录日志");
    }
}
