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
        super(title);
        this.duration = duration;
        this.volume = volume;
        this.brightness= brightness;
    }

    /*METODI*/
    @Override
    public void brightnessUp() {
        this.brightness = brightness +1;

    }

    @Override
    public void brightnessDown() {
        this.brightness = brightness -1;

    }

    @Override
    public void play() {

    }

    @Override
    public void vuolumeUp() {
        this.volume = volume +1;
    }

    @Override
    public void volumeDown() {
        this.volume = volume -1;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + getTitle() + '\'' +
                ", volume=" + volume +
                ", duration=" + duration +
                ", brightness=" + brightness +
                '}';
    }
}
