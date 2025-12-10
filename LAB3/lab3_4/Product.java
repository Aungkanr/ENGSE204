package LAB3.lab3_4;

public class Product {
    
    private String name;
    private static int ProductCount = 0;

    public Product (String nameProduct ){
        
        this.name = nameProduct;
        ProductCount++;
    }
    public String getName(){
        return name;
    }
    public static int getProductCount() { 
        return ProductCount;
    }
}

