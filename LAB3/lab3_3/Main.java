package LAB3.lab3_3;
import java.util.Scanner;

public class Main {

    public static void main(String[] pass) {

        Scanner input = new Scanner (System.in);
        String passold = input.nextLine();
        String passnew = input.nextLine();
        User user = new User (passold);
        
        user.setPassword(passnew);
        System.out.println(user.getPassword());


    }
    
}
