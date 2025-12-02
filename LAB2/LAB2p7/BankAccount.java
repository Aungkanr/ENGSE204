package LAB2.LAB2p7;

    class BankAccount {

        private String ownername;
        private double balance;
        public double depositAmount;

    public BankAccount ( String name , double somdun ){

        this.ownername = name;
        this.balance = somdun;
        
    }

    public void withdraw(double depositAmount ){
        if ( balance >= depositAmount ) {
            balance -= depositAmount;
            System.out.println("Witdrawal successful " );
        } else {
            System.out.println("lnsufficent funds");
        }
    }
    
    public void displaysomdun() {

        System.out.printf("balance = %.1f\n " , balance);
     
        }

}
