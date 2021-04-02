package com.emamagic.designpattern.factory;

public class Video extends Media {

    private String path;
    private String time;
    private String extension;

    public Video(String path, String time, String extension) {
        this.path = path;
        this.time = time;
        this.extension = extension;
    }

    @Override
    public String path() {
        return "Video path "+this.path;
    }

    @Override
    public String time() {
        return "Video time "+this.time;
    }

    @Override
    public String extension() {
        return "Video extension "+this.extension;
    }

    @Override
    public String toString() {
        return "Video{" +
                "path='" + path + '\'' +
                ", time='" + time + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
