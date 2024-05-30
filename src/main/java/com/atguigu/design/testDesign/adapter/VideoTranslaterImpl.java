package com.atguigu.design.testDesign.adapter;

public class VideoTranslaterImpl implements VideoTranslater {
    @Override
    public String translater() {
        System.out.println("这是翻译后的字幕");
        return "翻译后的字幕";
    }
}
