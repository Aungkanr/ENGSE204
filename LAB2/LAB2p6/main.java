package LAB2.LAB2p6;

import java.util.Scanner;
public class Main {

    public static void main (String [] tanakan){
        
        Scanner input = new Scanner(System.in);

        String ownername = input.nextLine();
        double balance = input.nextDouble();
        double depositAmount = input.nextDouble();

        BankAccount call = new BankAccount( ownername , balance);

        call.deposit(depositAmount);
        call.displaySum();

        input.close();
    }
    
}
