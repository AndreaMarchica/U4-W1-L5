package Multimedia.classes;

import Multimedia.interfaces.Playable;

public class Audio extends MultimediaFile implements Playable {

    /*ATTRIBUTI*/
    private String title;
    private int volume;
    private int duration;


    /*COSTRUTTORI*/
    public Audio(String title, int duration, int volume){
        this.title = title;
        this.duration = duration;
        this.volume = volume;
    }

    /*METODI*/
    @Override
    public void vuolumeUp() {

    }

    @Override
    public void volumeDown() {

    }
    @Override
    public void play() {

    }

}
