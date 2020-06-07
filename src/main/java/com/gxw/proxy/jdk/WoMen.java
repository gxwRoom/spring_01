package com.gxw.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * @author GXW工作室
 * @date 2020/6/6 0006 - 23:06
 */
public class WoMen {
    public static void main(String[] args){
        System.out.println(WoMen.class.getClassLoader()==LaoZong.class.getClassLoader());
        //创建秘书对象
        MiShu miShu = new MiShu();
        GongNeng gongneng1 = (GongNeng)Proxy.newProxyInstance(WoMen.class.getClassLoader(), new Class[]{GongNeng.class},miShu);
        GongNeng gongneng2 = (GongNeng)Proxy.newProxyInstance(LaoZong.class.getClassLoader(), new Class[]{GongNeng.class},miShu);
        gongneng1.eat();
        gongneng2.eat();
}
}
