package com.emamagic.designpattern.factory;

public class MediaFactory {

    public static Media getMedia(String type ,String path ,String time ,String extension) throws ClassNotFoundException {
        switch (type) {
            case "Video": {
                return new Video(path, time, extension);
            }
            case "Audio": {
                return new Audio(path, time, extension);
            }
            default:{
                throw new ClassNotFoundException();
            }
        }
    }

}
