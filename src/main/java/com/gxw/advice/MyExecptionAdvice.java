package com.gxw.advice;

/**
 * 异常通知
 *    只有当切点执行异常时才能出发异常通知
 * @author GXW工作室
 * @date 2020/6/6 0006 - 13:53
 */
public class MyExecptionAdvice {
    public void myExecption(){
        System.out.println("异常通知");
    }
}
