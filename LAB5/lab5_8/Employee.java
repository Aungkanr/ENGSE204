package LAB5.lab5_8;

public class Employee extends Person {

    protected double salary;
    
    public Employee(String name , double salary){

        super(name);
        this.salary = salary;

    }

    public void applyBonus(double bonus){
        
        salary = salary + bonus;

    }

    public String getStatus(){

        return "Employee :" + name + " Salary : " + salary;

    }
    
}
