package LAB3.lab3_8;

public class lnventoryitem {
    
    private String Productname;
    private int stock ;

    public lnventoryitem (String productname  , int initialStock){

    this.Productname = productname;
    this.stock = initialStock;

    if (initialStock > 0){
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName(){
        return Productname;
    }

    public int getStock(){
        return stock;
    }

    public void addStock(int amount) {

        if( amount > 0 ) {
            stock += amount;
            System.out.println("Stock added. ");
        } else {
            System.out.println("Invalid amount. ");
        }
    }

    public void sellStock(int amount) {

        if( amount <= 0 ) {
            System.out.println("Invalid amount. ");
        } else if (amount > stock) {
            System.out.println("Not enough stock. ");
        } else{
            stock -= amount;
            System.out.println("Salesuccessful. ");
        }
        
    }
}