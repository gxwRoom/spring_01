package com.gxw.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 秘书实现接口，使用反射
 * @author GXW工作室
 * @date 2020/6/6 0006 - 23:03
 */
public class MiShu implements InvocationHandler{
    //调用老总对象
    private LaoZong laoZong = new LaoZong();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("预约时间");
        Object result = method.invoke(laoZong, args);
        System.out.println("记录本次预约访客信息");
        return result;
    }
}
