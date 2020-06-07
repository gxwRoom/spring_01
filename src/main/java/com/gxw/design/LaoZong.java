package com.gxw.design;

/**
 * 老总：制定一个小目标
 * @author GXW工作室
 * @date 2020/6/6 0006 - 21:23
 */
public class LaoZong {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LaoZong() {
    }

    public LaoZong(String name) {
        this.name = name;
    }

    public void MuBiao(){
        System.out.println("制定小目标!");
    }

    public void ChuangYe(){
        System.out.println("目标：挣一个亿");
    }
}
