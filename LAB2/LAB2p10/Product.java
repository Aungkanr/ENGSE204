package LAB2.LAB2p10;

public class Product {
    
    private String name;
    private double price;

    public Product (String nameProduct ,double priceProduct ){
        
        this.name = nameProduct;
        this.price = priceProduct;
    }
    public double getPrice() { 
        return price;
    }
}