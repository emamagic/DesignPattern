package com.emamagic.designpattern.creational.abstract_factory.video;

import com.emamagic.designpattern.creational.abstract_factory.Media;

public class AVideo extends Media {

    private String path;
    private String extension;

    public AVideo(String path, String extension) {
        this.path = path;
        this.extension = extension;
    }

    @Override
    public String path() {
        return "Video path "+this.path;
    }


    @Override
    public String extension() {
        return "Video extension "+this.extension;
    }

    @Override
    public String toString() {
        return "Video{" +
                "path='" + path + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
