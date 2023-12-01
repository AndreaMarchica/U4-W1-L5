import Multimedia.classes.Audio;
import Multimedia.classes.Image;
import Multimedia.classes.MultimediaFile;
import Multimedia.classes.Video;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    /*ADDING MULTIMEDIA FILES CHOOSING TYPE*/
    for(int i = 0; i < 5; i++) {
        MultimediaFile[] files = new MultimediaFile[5];

        System.out.println("WHICH TYPE OF FILE DO YOU WANT TO CREATE? Write 'AUDIO', 'VIDEO' or 'IMAGE'");
        String type = scanner.nextLine().toLowerCase();
        switch (type) {
            case "audio" -> {
                System.out.println("INSERT AUDIO TRACK TITLE");
                String title = scanner.nextLine();
                System.out.println("INSERT AUDIO TRACK DURATION");
                int duration = scanner.nextInt();
                System.out.println("INSERT AUDIO TRACK VOLUME");
                int volume = scanner.nextInt();
                Audio track = new Audio(title, duration, volume);
                files[i] = track;
            }
            case "video" -> {
                System.out.println("INSERT VIDEO MOVIE TITLE");
                String title = scanner.nextLine();
                System.out.println("INSERT VIDEO MOVIE DURATION");
                int duration = scanner.nextInt();
                System.out.println("INSERT VIDEO MOVIE VOLUME");
                int volume = scanner.nextInt();
                System.out.println("INSERT VIDEO MOVIE BRIGHTNESS");
                int brightness = scanner.nextInt();
                Video movie = new Video(title, duration, volume, brightness);
                files[i] = movie;
            }
            case "image" -> {
                System.out.println("INSERT IMAGE TITLE");
                String title = scanner.nextLine();
                System.out.println("INSERT VIDEO MOVIE BRIGHTNESS");
                int brightness = scanner.nextInt();
                Image image = new Image(title, brightness);
                files[i] = image;
            }
            default -> {
                String error = "ERROR, UNKNOWN FILE TYPE: ";
            }
        }

        System.out.println(Arrays.toString(files));
    }



    Audio track1 = new Audio("Hell's Bells", 6, 4);
        System.out.println(track1);

    Image img1 = new Image("La Gioconda", 3);
        System.out.println(img1);

    Video movie1 = new Video("Inception", 10, 4, 3);
        movie1.vuolumeUp();
        System.out.println(movie1);
    }

}