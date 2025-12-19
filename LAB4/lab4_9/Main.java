package LAB4.lab4_9;

import java.util.Scanner;

public class Main {

    public static void main(String[] lmta) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID : "  );
        String ID = input.nextLine();
        System.out.print("Enter Starbalance : "  );
        double balance = input.nextDouble();
        System.out.print("Enter deposit : "  );
        double deposit = input.nextDouble();
        System.out.print("Enter withdraw : "  );
        double withdraw = input.nextDouble();

        lmmutableAccount acc1 = new lmmutableAccount(ID,balance);
        lmmutableAccount acc2 = acc1.deposit(deposit);
        lmmutableAccount acc3 = acc2.withdraw(withdraw);

        acc1.displaylnfo();
        acc3.displaylnfo();

        input.close();

    }
    
}
