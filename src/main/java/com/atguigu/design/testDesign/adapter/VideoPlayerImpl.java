package com.atguigu.design.testDesign.adapter;

public class VideoPlayerImpl implements VideoPlayer{
    @Override
    public String play() {
        System.out.println("video playing ...");
        System.out.println("这是原字幕");
        return "英语字幕";
    }
}
