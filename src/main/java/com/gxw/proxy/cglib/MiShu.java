package com.gxw.proxy.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author GXW工作室
 * @date 2020/6/6 0006 - 23:48
 */
public class MiShu implements MethodInterceptor{
    private LaoZong laoZong = new LaoZong();

    @Override
    public Object intercept(Object ob, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("预约时间");
        Object result = methodProxy.invokeSuper(ob, objects);
        System.out.println("记录访客信息");
        return result;
    }
}
