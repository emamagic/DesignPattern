package com.emamagic.designpattern.creational.factory;

public class Audio extends Media{

    private String path;
    private String extension;

    public Audio(String path, String extension) {
        this.path = path;
        this.extension = extension;
    }

    @Override
    public String path() {
        return "Audio path "+this.path;
    }


    @Override
    public String extension() {
        return "Audio extension "+this.extension;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "path='" + path + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
