package Multimedia.classes;

import Multimedia.interfaces.Brightness;

public class Image extends MultimediaFile implements Brightness {

    /*ATTRIBUTI*/
    private String title;
    private int brightness;

    /*COSTRUTTORI*/
    public Image(String title, int brightness){
        this.title = title;
        this.brightness = brightness;
    }

    /*METODI*/
    @Override
    public void brightnessUp() {

    }

    @Override
    public void brightnessDown() {

    }
}
