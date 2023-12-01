import Multimedia.classes.Audio;
import Multimedia.classes.Image;
import Multimedia.classes.MultimediaFile;
import Multimedia.classes.Video;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        MultimediaFile[] files = new MultimediaFile[5];

    /*ADDING MULTIMEDIA FILES CHOOSING TYPE*/
    for(int i = 0; i < 5; i++) {

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
                scanner.nextLine();
                files[i] = new Audio(title, duration, volume);
                break;
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
                scanner.nextLine();
                files[i] = new Video(title, duration, volume, brightness);
                break;
            }
            case "image" -> {
                System.out.println("INSERT IMAGE TITLE");
                String title = scanner.nextLine();
                System.out.println("INSERT VIDEO MOVIE BRIGHTNESS");
                int brightness = scanner.nextInt();
                scanner.nextLine();
                files[i]  = new Image(title, brightness);
                break;
            }
            default -> {
                String error = "ERROR, UNKNOWN FILE TYPE";
                System.out.println(error);
                i--; //return to previous interation
            }
        }
        System.out.println(Arrays.toString(files));
    }

        System.out.println("FILES CORRECTLY CREATED!"); //confirmation
        System.out.println("--------------------------------");

    /*CHOOSE WHICH FILE TO PLAY/SHOW*/
        System.out.println("WHICH FILE DO YOU WANT TO PLAY/SHOW? 'INSERT A NUMBER FROM 1 TO 5'");
        int choose = scanner.nextInt();
        if (choose == 1) {
            if(files[0] instanceof Audio) {
                ((Audio) files[0]).play();
            } else if (files[0] instanceof Video) {
                ((Video) files[0]).play();
            } else { ((Image) files[0]).show();
        }}
        else if (choose == 2) {
            if (files[1] instanceof Audio) {
                ((Audio) files[1]).play();
            } else if (files[1] instanceof Video) {
                ((Video) files[1]).play();
            } else {
                ((Image) files[1]).show();
                }
            }
        else if (choose == 3) {
            if (files[2] instanceof Audio) {
                ((Audio) files[2]).play();
            } else if (files[2] instanceof Video) {
                ((Video) files[2]).play();
            } else {
                ((Image) files[2]).show();
            }
        }
        else if (choose == 4) {
            if (files[3] instanceof Audio) {
                ((Audio) files[3]).play();
            } else if (files[3] instanceof Video) {
                ((Video) files[3]).play();
            } else {
                ((Image) files[3]).show();
            }
        }
        else if (choose == 5) {
            if (files[4] instanceof Audio) {
                ((Audio) files[4]).play();
            } else if (files[4] instanceof Video) {
                ((Video) files[4]).play();
            } else {
                ((Image) files[4]).show();
            }
        }
}}