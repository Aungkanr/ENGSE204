package LAB3.lab3_1;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] dataprivate) {

        Scanner input = new Scanner(System.in);

        String Username = input.nextLine();

        User username = new User (Username);// การสร้าง ออบเจ๊กต์

        System.out.print(username.getUsername());

        input.close();
    }
}
