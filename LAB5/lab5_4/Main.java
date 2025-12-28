package LAB5.lab5_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] cave) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter color : ");
        String color = input.nextLine();
        System.out.print("Enter wheels : ");
        int wheels = input.nextInt();

        Car car = new Car(color, wheels);
        car.displayDetails();

        input.close();
    }
    
}
