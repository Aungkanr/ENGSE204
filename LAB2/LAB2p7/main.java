package LAB2.LAB2p7;

import java.util.Scanner;

public class Main{
    
    public static void main (String [] atm){

        Scanner input = new Scanner(System.in);

        String ownername = input.nextLine();
        double balance1 =  input.nextDouble();
        double kang1 = input.nextDouble();
        double kang2 = input.nextDouble();

        System.out.println();

        BankAccount call = new BankAccount( ownername , balance1);

        call.withdraw(kang1);
        call.withdraw(kang2);
        call.displaysomdun();

        input.close();
    }
}