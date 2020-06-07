package com.gxw.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author GXW工作室
 * @date 2020/6/6 0006 - 23:56
 */
public class WoMen {
    public static void main(String[] args) {
        System.out.println(WoMen.class.getClassLoader()==LaoZong.class.getClassLoader());
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(LaoZong.class);
        enhancer.setCallback(new MiShu());

        LaoZong laoZong = (LaoZong) enhancer.create();
        laoZong.eat();
    }
}
