package Multimedia.classes;

import Multimedia.classes.MultimediaFile;
import Multimedia.interfaces.Brightness;
import Multimedia.interfaces.Playable;

public class Video extends MultimediaFile implements Playable, Brightness {

    /*ATTRIBUTI*/
    private String title;
    private int volume;
    private int duration;
    private int brightness;

    /*COSTRUTTORI*/
    public Video(String title, int duration, int volume, int brightness){
        this.title = title;
        this.duration = duration;
        this.volume = volume;
        this.brightness= brightness;
    }

    /*METODI*/
    @Override
    public void brightnessUp() {

    }

    @Override
    public void brightnessDown() {

    }

    @Override
    public void play() {

    }

    @Override
    public void vuolumeUp() {

    }

    @Override
    public void volumeDown() {

    }
}
