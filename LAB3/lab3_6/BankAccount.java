package LAB3.lab3_6;

public class BankAccount {
    
    private double balance;

    public BankAccount (double initialBalance){

        if(initialBalance >= 0){
            this.balance = initialBalance;
        } else {
             this.balance = (0);
        }
    }

    public double getbalance(){
        return balance;
    }

    public void deposit(double amount){
        
        if ( amount > 0 ){
            balance += amount;
            System.out.println("Deposit successful ");
        } else {
            System.out.println("Invalid deposit amount. ");
        }
    }

    public void withdraw(double amount){
        
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. ");
        } else if (amount > balance) {
            System.out.println("lnsufficient funds. ");
        } else {
            System.out.println("Invalid withdraw amount. ");
        }
    }
}
