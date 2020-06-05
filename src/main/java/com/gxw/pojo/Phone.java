package com.gxw.pojo;

import java.io.Serializable;

/**
 * Phone手机实体类
 * @author GXW工作室
 * @date 2020/6/4 0004 - 21:19
 */
public class Phone implements Serializable{
    private Integer id;
    private String name;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
