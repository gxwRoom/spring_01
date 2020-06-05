package com.gxw.pojo;

/**
 * PeopleFactory实例工厂
 * @author GXW工作室
 * @date 2020/6/4 0004 - 14:10
 */
public class PeopleFactory {
    //需要先创建工厂
    public People newInstanceFactory(){
        return new People(1,"张三丰","男");
    }
}
