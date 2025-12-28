package LAB5.lab5_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] adog) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = input.nextLine();
        System.out.print("Enter age : ");
        int age = input.nextInt();

        Dog dog  = new Dog(name,age);

        dog.makeSound();
        dog.displayInfo();

        input.close();
    }
}
