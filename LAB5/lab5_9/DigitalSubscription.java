package LAB5.lab5_9;

public class DigitalSubscription extends Item {

    protected double monthlyCost;
    protected int months;

    public DigitalSubscription (String name,double monthlyCost,int months){

        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    public double getValue(){
        return monthlyCost*months;
    }
    
}
