package LAB5.lab5_7;

public class SalesEmployee extends Employee {

    protected double commissionRatel;

    public SalesEmployee(String name ,double basesalary ,double commissionRatel){
        
        super(name,basesalary);
        this.commissionRatel = commissionRatel;
    
    }
    
    public double calculatePay(){
        
        return basesalary + basesalary*commissionRatel;
    }
}
