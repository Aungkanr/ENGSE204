package LAB3.lab3_14;

    public class Bankaccount10{
    private double balance;
    private static int totalTransactionCount = 0;

    public Bankaccount10(Double initialDeposit){
        if(initialDeposit >= 0){
            this.balance = initialDeposit;
            System.out.println("Account created");
        }
        else{
            this.balance = 0;
        }

    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        }
        else{
            System.out.println("Invalid amount.");

        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        }
        else if(amount > balance){
            System.out.println("Insufficient funds.");
        }
        else{
            System.out.println("Invalid amount.");

        }
    }
    public double getBalance(){
        return balance;
    }
    public static int getTotalTransactionCount(){
        return totalTransactionCount;
    }
}