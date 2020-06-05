package com.gxw.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Pepole实体类创建
 * @author GXW工作室
 * @date 2020/6/4 0004 - 11:48
 */
public class People implements Serializable{
    private Integer id;
    private String username;
    private String sex;

    private Set<String> sets;
    private List<String> lists;
    private Map<String,String> maps;
    private Properties demo;

    //手机
    private Phone phone;

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", sets=" + sets +
                ", lists=" + lists +
                ", maps=" + maps +
                ", demo=" + demo +
                ", phone=" + phone +
                '}';
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Properties getDemo() {
        return demo;
    }

    public void setDemo(Properties demo) {
        this.demo = demo;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    //无参构造方法
    public People() {
        super();
        //执行无参构造方法
//        System.out.println("执行无参构造方法");
    }

    public People(Integer id, String username, String sex) {
        super();
        this.id = id;
        this.username = username;
        this.sex = sex;
        //执行有参构造方法
//        System.out.println("执行有参构造方法");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("执行setId方法");
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("执行setUsername方法");
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        System.out.println("执行setSex方法");
        this.sex = sex;
    }

}
