package com.gxw.singleton;

/**
 * 单例设计模式
 *    在应用程序中保证最多只有一个实例对象
 * 饿汉式
 * @author GXW工作室
 * @date 2020/6/7 0007 - 20:47
 */
public class SingleTon2 {
    private static SingleTon2 singleTon2 = new SingleTon2();

    //无参构造方法
    private SingleTon2(){
    }

    //创建一个公有的静态方法进行调用
    public static SingleTon2 getInstance(){
        return singleTon2;
    }
}
