package LAB3.lab3_9;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] sepo) {

        Scanner input = new Scanner(System.in);

        int minLength1 = input.nextInt();
        input.nextLine();
        
        String user1_name = input.nextLine();
        String user1_pass = input.nextLine();
        String user2_name = input.nextLine();
        String user2_pass = input.nextLine();

        int minLength2 = input.nextInt();
        input.nextLine();

        String user2newPassword = input.nextLine();
        
        User.setMinLength(minLength1);
        User user_1 = new User(user1_name , user1_pass);
        User user_2 = new User(user2_name , user2_pass);

        User.setMinLength(minLength2);
        user_2.setPassword(user2newPassword);

        System.out.println(user_1.getPassword());
        System.out.println(user_2.getPassword());

        input.close();
    }
}
