package LAB4.lab4_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] loti) {
        
        Scanner input = new Scanner(System.in);

        double latitude = input.nextDouble();
        double longitude = input.nextDouble();
        double newLat = input.nextDouble();

        Location loc1 = new Location(latitude,longitude);
        Location loc2 = new Location (loc1);

        loc1.setLatitude(newLat);

        loc1.dispalylnfo();
        loc2.dispalylnfo();

        input.close();
    }
}
