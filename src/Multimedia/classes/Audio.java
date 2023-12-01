package Multimedia.classes;

import Multimedia.interfaces.Playable;

public class Audio extends MultimediaFile implements Playable {

    /*ATTRIBUTI*/
    private String title;
    private int volume;
    private int duration;


    /*COSTRUTTORI*/
    public Audio(String title, int duration, int volume){
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    /*METODI*/
    @Override
    public void vuolumeUp() {
        this.volume = volume +1;
    }

    @Override
    public void volumeDown() {
        this.volume = volume -1;
    }
    @Override
    public void play() {
        for(int i = 0; i < this.volume; i++){
            System.out.println(this.title + this.volume);
    }
    }

    @Override
    public String toString() {
        return "Audio{" +
                "title='" + getTitle() + '\'' +
                ", volume=" + volume +
                ", duration=" + duration +
                '}';
    }
}
