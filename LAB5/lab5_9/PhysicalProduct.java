package LAB5.lab5_9;

public class PhysicalProduct extends Item {
    
    protected double unitPrice;
    protected int quality;
    
    public PhysicalProduct(String name , double unitPrice,int quality){
        
        super(name);
        this.unitPrice = unitPrice;
        this.quality = quality;

    }

    public double getValue(){
        
        return unitPrice*quality;
    }

}
