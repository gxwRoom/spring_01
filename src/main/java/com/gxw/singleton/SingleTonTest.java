package com.gxw.singleton;

/**
 * 单例设计模式测试
 *   1.懒汉式
 *   2.饿汉式
 * @author GXW工作室
 * @date 2020/6/7 0007 - 20:50
 */
public class SingleTonTest {
    public static void main(String[] args) {
        //1.懒汉式
        SingleTon1 singleTon11 =  SingleTon1.getInstance();
        SingleTon1 singleTon12 =  SingleTon1.getInstance();
        System.out.println(singleTon11==singleTon12);

        //2.饿汉式
        SingleTon2 singleTon21 =  SingleTon2.getInstance();
        SingleTon2 singleTon22 =  SingleTon2.getInstance();
        System.out.println(singleTon21==singleTon22);

    }
}
