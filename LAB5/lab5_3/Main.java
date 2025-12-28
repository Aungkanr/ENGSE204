package LAB5.lab5_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] emna) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary : ");
        double salary = input.nextDouble();
        
        Manager manag = new Manager(salary);
        manag.salary = salary;

        System.out.print(manag.calculateBonus());
        
        input.close();
    }
    
}
