package LAB3.lab3_15;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner data11 = new Scanner(System.in);

        System.out.print("User Login System : ");
        String username15 = data11.next();
        System.out.print("Enter number of operations: ");
        int value11 = data11.nextInt();

        User user15 = null; 

        for (int i = 0; i < value11; i++) {
            System.out.print("Enter operation type (LOGIN/SET_POLICY): ");
            String operation11 = data11.next();

            if (operation11.equalsIgnoreCase("SET_POLICY")) {
                int max11 = data11.nextInt();
                User.setPolicy(max11);
            } 
            else if (operation11.equalsIgnoreCase("LOGIN")) {
                if (user15 == null) {
                    user15 = new User(username15);
                }

                System.out.print("Enter password: ");
                String password15 = data11.next();
                user15.login(password15);
            } 
            else {
                System.out.println("Invalid operation.");
            }
        }

        data11.close();
    }
}

