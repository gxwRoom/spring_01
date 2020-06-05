package com.gxw.pojo;

/**
 * PeopleStaticFactory静态工厂
 * 在方法上添加static
 * @author GXW工作室
 * @date 2020/6/4 0004 - 14:22
 */
public class PeopleStaticFactory {
    //不需要创建工厂
    public static People newInstanceStaticFactory(){
        return new People(2,"金毛狮王谢逊","男");
    }
}
