package LAB5.lab5_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] emps) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter nameSalesEmployee : ");
        String nameSalesEmployee = input.nextLine();
        System.out.print("Enter salarySalesEmployee : ");
        double salarySalesEmployee = input.nextDouble();
        System.out.print("Enter rateSalesEmployee : ");
        double rateSalesEmployee = input.nextDouble();

        input.nextLine();

        System.out.print("Enter nameManager : ");
        String nameManager = input.nextLine();
        System.out.print("Enter salaryManager : ");
        double salaryManager = input.nextDouble();
        System.out.print("Enter bonusManager : ");
        double bonusManager = input.nextDouble();

        SalesEmployee salesEmployee = new SalesEmployee(nameSalesEmployee, salarySalesEmployee , rateSalesEmployee);
        Manager manager = new Manager(nameManager, salaryManager, bonusManager);

        PayrollProcessor.process(salesEmployee);
        PayrollProcessor.process(manager);

        input.close();


    }
}
