package Multimedia.classes;

public abstract class MultimediaFile {
    /*ATTRIBUTI*/
    private String title;

    /*COSTRUTTORI*/
    protected MultimediaFile(String title) {
        this.title = title;
    }

    /*METODI*/
    public String getTitle() {
        return title;
    }
}
