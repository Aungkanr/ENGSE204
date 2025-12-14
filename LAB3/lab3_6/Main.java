package LAB3.lab3_6;
import java.util.Scanner;

public class Main {

    public static void main(String[] bacc) {

        Scanner input = new Scanner(System.in);
        double balance = input.nextDouble();
        double deposit = input.nextDouble();
        double Withdrawal = input.nextDouble();

        BankAccount bankAccount = new BankAccount (balance);

        bankAccount.deposit(deposit);
        bankAccount.withdraw(Withdrawal);

        System.out.printf("Final Balance : %.1f \n",bankAccount.getbalance());

        input.close();
    } 
}
