package LAB5.lab5_7;

public class Manager extends Employee {

    protected double fixedBonus;

    public Manager(String name , double basesalary , double fixedBonus){

        super(name, basesalary);
        this.fixedBonus = fixedBonus;

    }

    public double calculatePay(){
        
        return basesalary + fixedBonus;
    }
    
}
