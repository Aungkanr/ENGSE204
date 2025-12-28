package LAB5.lab5_15;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter Car details:");
        System.out.print("Model: ");
        String carModel = scanner.nextLine();
        System.out.print("Rental Rate: ");
        double carRate = scanner.nextDouble();
        scanner.nextLine(); 

        
        System.out.println("Enter Motorcycle details:");
        System.out.print("Model: ");
        String motoModel = scanner.nextLine();
        System.out.print("Rental Rate: ");
        double motoRate = scanner.nextDouble();


        Car car = new Car(carModel, carRate);
        Motorcycle motorcycle = new Motorcycle(motoModel, motoRate);

    
        RentalVehicle[] vehicles = new RentalVehicle[2];
        vehicles[0] = car;
        vehicles[1] = motorcycle;

        double totalFee = 0;
        System.out.println("\n--- Calculation Details ---");
        
        for (RentalVehicle v : vehicles) {
            double fee = v.calculateFee();

            System.out.println("Vehicle Model: " + v.model + " | Fee: " + fee);
            totalFee += fee;
        }

    
        System.out.println("---------------------------");
        System.out.println("Total Rental Fee: " + totalFee);
        
        scanner.close();
    }
}