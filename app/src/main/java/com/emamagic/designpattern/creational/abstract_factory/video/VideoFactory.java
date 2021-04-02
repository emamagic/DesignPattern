package com.emamagic.designpattern.creational.abstract_factory.video;

import com.emamagic.designpattern.creational.abstract_factory.Media;
import com.emamagic.designpattern.creational.abstract_factory.MediaAbstractFactory;

public class VideoFactory implements MediaAbstractFactory {

    private String path;
    private String extension;

    public VideoFactory(String path, String extension) {
        this.path = path;
        this.extension = extension;
    }

    @Override
    public Media createMedia() {
        return new AVideo(path ,extension);
    }
}
