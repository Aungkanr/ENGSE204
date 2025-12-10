package LAB3.lab3_2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] scpy) {
        
        Scanner input = new Scanner (System.in);

        int initialScore = input.nextInt();
        Player player = new Player(initialScore);
        
        int Update = input.nextInt();
        player.setScore(Update); 

        System.out.print(player.getScore());

        input.close();
    }
}

