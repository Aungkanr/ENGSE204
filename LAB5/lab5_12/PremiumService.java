package LAB5.lab5_12;

public class PremiumService extends Service {

    protected double premiumRate;

    public PremiumService(String name , double basePrice , double premiumRate){

        super(name, basePrice);
        this.premiumRate = premiumRate;

    }
    
    @Override
    public double calculateFinalPrice(){

        return basePrice* ( 1 + premiumRate );

    }
    
}
