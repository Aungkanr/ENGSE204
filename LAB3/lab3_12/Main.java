package LAB3.lab3_12;

import java.util.Scanner;

import LAB3.lab3_11.SystemConfig;

public class Main {
    
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        String name = input1.nextLine();
        double salary = input1.nextDouble();
        double taxRate = input1.nextDouble();
        double raiseAmount = input1.nextDouble();

        Employee emp = new Employee(name, salary);
        System.out.println("Tax (before): " + emp.calculateTax(taxRate));
        emp.giveRaise(raiseAmount);
        System.out.println("Tax (after): "+ String.format("%.1f", emp.calculateTax(taxRate)));

        input1.close();
    }
}


