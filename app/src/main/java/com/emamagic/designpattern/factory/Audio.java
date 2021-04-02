package com.emamagic.designpattern.factory;

public class Audio extends Media{

    private String path;
    private String time;
    private String extension;

    public Audio(String path, String time, String extension) {
        this.path = path;
        this.time = time;
        this.extension = extension;
    }

    @Override
    public String path() {
        return "Audio path "+this.path;
    }

    @Override
    public String time() {
        return "Audio time "+this.time;
    }

    @Override
    public String extension() {
        return "Audio extension "+this.extension;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "path='" + path + '\'' +
                ", time='" + time + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
