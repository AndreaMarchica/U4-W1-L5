import Multimedia.classes.Audio;
import Multimedia.classes.Image;
import Multimedia.classes.MultimediaFile;
import Multimedia.classes.Video;

public class Main {
    public static void main(String[] args) {
/*    for(int i = 0; i<)*/
    Audio track1 = new Audio("Hell's Bells", 6, 4);
        System.out.println(track1);

    Image img1 = new Image("La Gioconda", 3);
        System.out.println(img1);

    Video movie1 = new Video("Inception", 10, 4, 3);
        movie1.vuolumeUp();
        System.out.println(movie1);
    }
}