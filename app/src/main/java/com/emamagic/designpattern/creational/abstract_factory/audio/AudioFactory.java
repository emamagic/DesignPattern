package com.emamagic.designpattern.creational.abstract_factory.audio;

import com.emamagic.designpattern.creational.abstract_factory.Media;
import com.emamagic.designpattern.creational.abstract_factory.MediaAbstractFactory;

public class AudioFactory implements MediaAbstractFactory {

    private String path;
    private String extension;

    public AudioFactory(String path, String extension) {
        this.path = path;
        this.extension = extension;
    }

    @Override
    public Media createMedia() {
        return new AAudio(path ,extension);
    }
}
