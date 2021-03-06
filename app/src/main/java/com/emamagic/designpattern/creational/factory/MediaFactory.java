package com.emamagic.designpattern.creational.factory;

public class MediaFactory {

    public static Media getMedia(Class type ,String path ,String extension) throws ClassNotFoundException {
        switch (type.getSimpleName()) {
            case "Video": {
                return new Video(path, extension);
            }
            case "Audio": {
                return new Audio(path, extension);
            }
            default:{
                throw new ClassNotFoundException();
            }
        }
    }

}
