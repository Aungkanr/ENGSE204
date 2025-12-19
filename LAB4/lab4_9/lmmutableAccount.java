package LAB4.lab4_9;

public class lmmutableAccount {

    private String accountld;
    private double balance;
    
    public lmmutableAccount(String accountld , double balance ){

        this.accountld =accountld;

        if(balance < 0){
            balance = 0.0;
        }else{
            this.balance = balance;
        } 
    }

    public lmmutableAccount(lmmutableAccount other) {
        
        this.accountld = other.accountld;
        this.balance = other.balance ;

    }

    public String getAccountld(){
        return accountld;
    }
    public double getbalance(){
        return balance;
    }

    public lmmutableAccount deposit (double amount) {
        
        if(amount > 0 ){
             double Balance = this.balance + amount;
             return  new lmmutableAccount(this.accountld,this.balance + amount);
        }else{
            System.out.println("lnvalid deposit amount."  );
            return this;
        }

    }

    public lmmutableAccount withdraw(double amount) {

        if(amount > 0 && amount <= this.balance ){
             return  new lmmutableAccount(this.accountld,this.balance - amount);
        }else if(amount > balance){
            System.out.println("lnsufficient funds." );
            return this;
        }else {
            System.out.println("lnvalid withdraeal amount. " );
            return this;    
        }
    }

    public void displaylnfo(){
        
        System.out.println("ID :  " + accountld + " , Balance : " + balance );
    }
}
