package LAB3.lab3_12;

public class Employee {
    
    private String name;
    private double monthlySalary;

    public Employee(String n, double Sal){
        this.name = n;
        if(Sal > 0){
             this.monthlySalary = Sal ;
        }
        else{
            this.monthlySalary = 0;
        }
    }
    public String getName(){
        return name;
    }
    public void giveRaise(double amonut){
        if(amonut > 0){
            this.monthlySalary += amonut;
            System.out.println("Raise applied.");
        }
        else if(amonut <= 0){
            System.out.println("Invalid amount.");

        }
    }
    private double getAnnualSalary(){
        return monthlySalary * 12;

    


    }
    public double calculateTax(double taxRate){
        return getAnnualSalary() * taxRate;
    }
}
