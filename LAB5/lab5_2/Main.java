package LAB5.lab5_2;

import java.util.Scanner;
public class Main {

    public static void main(String[] caan) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = input.nextLine();
        System.out.print("Enter age : ");
        int age = input.nextInt();

        Cat cat  = new Cat (name,age);
        
        cat.displaylnfo();
        cat.makeSound();
        

        input.close();
    }
    
}
