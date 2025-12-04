package LAB2.LAB2p11;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] mainrod) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Car Model : ");
        String model = input.nextLine();

        System.out.println("Production Year : ");
        int yearProduced = input.nextInt(); 
        input.nextLine();

        System.out.println(" New Updated Year : ");
        int newYear = input.nextInt(); 
        input.nextLine(); 
        
        Car myCar = new Car(model, yearProduced);

        myCar.setYear(newYear);
        
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
     
        input.close();
    }
}

