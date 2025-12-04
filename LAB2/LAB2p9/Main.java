package LAB2.LAB2p9;

import java.util.Scanner;

public class Main {
    
    public static void main (String[] data) {
        
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        String street = input.nextLine();
        String city = input.nextLine();
        String zipcode = input.nextLine();

        Address address = new Address(street,city,zipcode);   

        Student dataStudent = new Student(name,address);

        dataStudent.displayProfile();

        input.close();
    }
}
