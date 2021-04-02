package com.emamagic.designpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.emamagic.designpattern.creational.abstract_factory.AMediaFactory
import com.emamagic.designpattern.creational.abstract_factory.audio.AAudio
import com.emamagic.designpattern.creational.abstract_factory.audio.AudioFactory
import com.emamagic.designpattern.creational.abstract_factory.video.AVideo
import com.emamagic.designpattern.creational.abstract_factory.video.VideoFactory
import com.emamagic.designpattern.creational.builder.Person
import com.emamagic.designpattern.creational.delegation.EmployKotlin
import com.emamagic.designpattern.creational.delegation.coder.Coder
import com.emamagic.designpattern.creational.delegation.designer.Designer
import com.emamagic.designpattern.creational.factory.Audio
import com.emamagic.designpattern.creational.factory.MediaFactory
import com.emamagic.designpattern.creational.factory.Video

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //////////////////////////////// Delegation //////////////////////////////////////

        // TAG -> DELEGATION
        val employ = EmployKotlin(
                Coder(),
                Designer()
        )
        employ.code()
        employ.design()


        //////////////////////////////// Builder //////////////////////////////////////

        val person: Person = Person.Builder()
                .name("ali")
                .family("rezaii")
                .phone("00999999")
                .age(22)
                .build()

        Log.e("BUILDER", "Person -> $person")


        //////////////////////////////// Factory //////////////////////////////////////

        val video: Video = MediaFactory.getMedia(Video::class.java ,"video path" ,"video extension") as Video
        val audio: Audio = MediaFactory.getMedia(Audio::class.java ,"audio path" ,"audio extension") as Audio

        Log.e("FACTORY", "Media -> $video")
        Log.e("FACTORY", "Media -> $audio")


        //////////////////////////////// Abstract Factory //////////////////////////////////////

        val abstractVideo: AVideo = AMediaFactory.getMedia(VideoFactory("video path", "video extension")) as AVideo
        val abstractAudio: AAudio = AMediaFactory.getMedia(AudioFactory("audio path", "audio extension")) as AAudio

        Log.e("ABSTRACT_FACTORY", "Media -> $abstractVideo")
        Log.e("ABSTRACT_FACTORY", "Media -> $abstractAudio")


    }
}