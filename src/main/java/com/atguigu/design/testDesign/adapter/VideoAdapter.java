package com.atguigu.design.testDesign.adapter;

public class VideoAdapter implements VideoPlayer{
    VideoPlayer videoPlayer ;
    VideoTranslater videoTranslater = new VideoTranslaterImpl();
    public VideoAdapter(VideoPlayer videoPlayer){
        this.videoPlayer = videoPlayer;
    }


    @Override
    public String play() {
        videoPlayer.play();
        videoTranslater.translater();
        return null;
    }
}
