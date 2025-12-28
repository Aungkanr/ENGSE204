package LAB5.lab5_3;

public class Manager extends Employee {

    public Manager(double salary){

        super(salary);
    }

    public double calculateBonus(){

        return super.calculateBonus() + (salary * 0.05);

    }
}