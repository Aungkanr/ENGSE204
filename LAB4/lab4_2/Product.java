package LAB4.lab4_2;

public class Product {

    private String name;
    private double price;
    
    public Product(String name){

        this(name,0.0);

    }

    public Product (String name , double price){

        this.name = name;
        this.price = price;

    }

    public void dispalylnfo(){

        System.out.print("Name :  " + name );
        System.out.print(", Price : " + price);
    
    }
}
