package LAB5.lab5_3;

public class Employee {

    protected double salary;

    public Employee(double salary){

        this.salary = salary;

    }
    
    public double calculateBonus(){
        
        return salary * 0.10;
    }
    
}
