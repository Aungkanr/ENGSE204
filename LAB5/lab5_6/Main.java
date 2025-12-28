package LAB5.lab5_6;

import java.util.Scanner;
public class Main {
    
    public static void main(String[]amoa) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter  titlevideo : ");
        String titlevideo = input.nextLine();
        System.out.print("Enter durationvideo : ");
        int durationvideo = input.nextInt();

        input.nextLine();

        System.out.print("Enter titleaudio : ");
        String titleaudio = input.nextLine();
        System.out.print("Enter qualityaudio : ");
        String qualityaudio = input.nextLine();


        Video video = new Video(titlevideo, durationvideo);
        Audio audio = new Audio(titleaudio, qualityaudio);

        Processor.runProcessor(video);
        Processor.runProcessor(audio);

        input.close();
    }
    
}
