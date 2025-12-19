package LAB4.lab4_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] pler) {
        Scanner input = new Scanner (System.in);

        int m = input.nextInt();
        input.nextLine();
        

        if( m == 1 ){
            
            Player player = new Player();
            player.displayProfile();
            
        } else if( m == 2) {

            String username = input.nextLine();
            int level = input.nextInt();
            Player player = new Player(username,level);
            player.displayProfile();
        }else{
             System.out.printf("mode 1 or mode 2");
        }
            input.close();
    }
    
}
