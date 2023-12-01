import Multimedia.classes.Audio;
import Multimedia.classes.Image;
import Multimedia.classes.Video;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    Audio track1 = new Audio("Hell's Bells", 6, 4);
        System.out.println(track1);

    Image img1 = new Image("La Gioconda", 3);
        System.out.println(img1);

    Video movie1 = new Video("Inception", 10, 4, 3);
        System.out.println(movie1);
    }
}