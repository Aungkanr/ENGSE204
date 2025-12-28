package LAB5.lab5_7;

public class Employee {

    protected String name;
    protected double basesalary;
    
    public Employee(String name , double basesalary){

        this.name = name;
        this.basesalary = basesalary;
    }

    public double calculatePay(){
        return basesalary;
    }
    
}
