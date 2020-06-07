package com.gxw.design;

/**
 * @author GXW工作室
 * @date 2020/6/6 0006 - 21:26
 */
public class MiSu implements GongNeng{
    private LaoZong laoZong = new LaoZong("云云");

    @Override
    public void MuBiao() {
        System.out.println("约定时间");
        laoZong.MuBiao();
        System.out.println("把客户备注");
    }

    @Override
    public void ChuangYe() {
        System.out.println("开始开张营业");
        laoZong.ChuangYe();
        System.out.println("今天的营业额收入");
    }
}
