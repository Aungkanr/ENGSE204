package LAB2.LAB2p10;

public class ShoppingCart {

    private Product items[];
    private int itemCount;
    
    public ShoppingCart(Product kong[], int kongnaitaka){

        this.items = kong;
        this.itemCount = kongnaitaka;
    } 
    
    public ShoppingCart() {
        items = new Product[10]; 
        itemCount = 0;
    }

    public void addProduct(Product p) {
        if (itemCount < items.length) {
            items[itemCount] = p;
            itemCount++;
        } else {
            System.out.println("It's full.");
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            
            total += items[i].getPrice(); 
        }
        return total;
    } 
}