package com.atguigu.design.testDesign.decorate;

public class YinTiktokDecorate implements TiktokDecorate {

    private Tiktok tiktok;

    public YinTiktokDecorate(Tiktok tiktok){
        this.tiktok = tiktok;
    }

    @Override
    public void enable() {
        System.out.println("对直播间进行装饰。。。");
    }

    @Override
    public void tiktok() {
        enable();
        tiktok.tiktok();
    }
}
