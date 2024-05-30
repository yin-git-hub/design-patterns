package com.atguigu.design.testDesign.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        VideoAdapter videoAdapter = new VideoAdapter(new VideoPlayerImpl());
        videoAdapter.play();
    }
}
