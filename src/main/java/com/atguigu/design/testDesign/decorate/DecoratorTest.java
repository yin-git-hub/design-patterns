package com.atguigu.design.testDesign.decorate;

public class DecoratorTest {
    public static void main(String[] args) {
        Tiktok tiktok = new YinTictok();
        YinTiktokDecorate yinTiktokDecorate = new YinTiktokDecorate(tiktok);
        yinTiktokDecorate.tiktok();
    }
}
