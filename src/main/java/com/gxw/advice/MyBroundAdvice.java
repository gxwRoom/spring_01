package com.gxw.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕通知
 * @author GXW工作室
 * @date 2020/6/6 0006 - 20:47
 */
public class MyBroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation method) throws Throwable {
        System.out.println("环绕前置通知!");
        method.proceed();//调用执行方法
        System.out.println("环绕后置通知!");
        return method;
    }
}
