package LAB5.lab5_10;

public class ComplexTask extends ProjectTask {

    protected double setupFee;
    
    public ComplexTask(String description , int baseHours , double setupFee ){

        super(description, baseHours);
        this.setupFee = setupFee;

    }

    public double calculateCost(){
        return super.calculateCost()*1.10 + setupFee ;
    }
    

}
