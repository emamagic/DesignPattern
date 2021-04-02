package com.emamagic.designpattern.creational.abstract_factory.audio;

import com.emamagic.designpattern.creational.abstract_factory.Media;
import com.emamagic.designpattern.creational.abstract_factory.MediaAbstractFactory;

public class AAudio extends Media implements MediaAbstractFactory {

    private String path;
    private String extension;

    public AAudio(String path, String extension) {
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

    @Override
    public Media createMedia() {
        return new AAudio(path ,extension);
    }
}
