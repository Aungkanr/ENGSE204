package LAB4.lab4_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] rerc) {
        
        Scanner input = new Scanner(System.in);

        String id1 = input.nextLine();
        String id2 = input.nextLine();
        String id3 = input.nextLine();

        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        r1 = null;
        r2 = null;

        System.gc();
        r3 = null;
        System.gc();
        input.close();

    }
    
}
