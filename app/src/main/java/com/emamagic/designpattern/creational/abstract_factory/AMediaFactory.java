package com.emamagic.designpattern.creational.abstract_factory;

public class AMediaFactory {

    public static Media getMedia(MediaAbstractFactory factory) {
        return factory.createMedia();
    }

}
