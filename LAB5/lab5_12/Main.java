package LAB5.lab5_12;

import java.util.Scanner;

public class Main {

    public static void main(String[] bpss) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name Basic : ");
        String nameBasic = input.nextLine();
        System.out.print("Enter basePrice Basic : ");
        double basePriceBasic = input.nextDouble();
        
        input.nextLine();

        System.out.print("Enter name SimpleTask : ");
        String namePremium = input.nextLine();
        System.out.print("Enter basePrice SimpleTask : ");
        double basePricePremium = input.nextDouble();
        System.out.print("Enter premiumRate SimpleTask : ");
        double premiumRate = input.nextDouble();



        BasicService basicService = new BasicService(nameBasic, basePriceBasic);
        PremiumService premiumService = new PremiumService(namePremium, basePricePremium, premiumRate);

        Service[] dataService = new Service[2];
        dataService[0] = basicService;
        dataService[1] = premiumService;

        for (Service se : dataService) {

            System.out.println(se. calculateFinalPrice());
        }
        
        input.close();
    }
    
}
