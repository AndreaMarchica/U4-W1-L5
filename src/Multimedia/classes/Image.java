package Multimedia.classes;

import Multimedia.interfaces.Brightness;

public class Image extends MultimediaFile implements Brightness {

    /*ATTRIBUTI*/
    private String title;
    private int brightness;

    /*COSTRUTTORI*/
    public Image(String title, int brightness){
        super(title);
        this.brightness = brightness;
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

    public void show() {

    }

    @Override
    public String toString() {
        return "Image{" +
                "title='" + getTitle() + '\'' +
                ", brightness=" + brightness +
                '}';
    }
}
