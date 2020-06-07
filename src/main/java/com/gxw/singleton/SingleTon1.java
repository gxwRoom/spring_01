package com.gxw.singleton;

/**
 * 单例设计模式
 *    在应用程序中保证最多只有一个实例对象
 * 懒汉式
 * @author GXW工作室
 * @date 2020/6/7 0007 - 20:47
 */
public class SingleTon1 {
    //将对象方法设置为static，防止他人访问
    private static SingleTon1 singleTon1;

    //无参构造方法
    private SingleTon1(){
    }

    //创建一个公有的静态方法进行调用
    public static SingleTon1 getInstance(){
        if (singleTon1==null){
            //添加锁
            synchronized(SingleTon1.class){
                if (singleTon1==null){
                    singleTon1 = new SingleTon1();
                }
            }
        }
        return singleTon1;
    }
}
