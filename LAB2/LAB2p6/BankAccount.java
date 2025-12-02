package LAB2.LAB2p6;

public class BankAccount {
    
    private String ownername;
    private double balance;
    public double depositAmount;

    public BankAccount ( String name , double somdun ){

        this.ownername = name;
        this.balance = somdun;

    }

    public void deposit(double amount){

        if ( amount > 0 ) {
            balance += amount ;
        }
    }
    public void displaySum() {

        System.out.println("Owner : " + ownername);
        System.out.println("Balance " + balance);
     
    }
}