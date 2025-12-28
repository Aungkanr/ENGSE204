package LAB5.lab5_9;

import java.util.Scanner;

public class Main {

    public static void main(String[] ditp) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter namePhysicalProduct : ");
         String namePhysicalProduct = input.nextLine();
         System.out.print("Enter nameEmployee : ");
         double unitPrice = input.nextDouble();
         System.out.print("Enter nameEmployee : ");
         int quality = input.nextInt();
         
         input.nextLine();

        System.out.print("Enter nameDigitalSubscription : ");
        String nameDigitalSubscription = input.nextLine();
        System.out.print("Enter monthlyCost : ");
        double monthlyCost = input.nextDouble();
        System.out.print("Enter months : ");
        int months = input.nextInt();


        PhysicalProduct physicalProduct = new PhysicalProduct(namePhysicalProduct, unitPrice, quality);
        DigitalSubscription digitalSubscription = new DigitalSubscription(nameDigitalSubscription, monthlyCost, months);

        Item[] items = {physicalProduct,digitalSubscription};

         int num = 0;
        for(int i = 0 ; i < items.length-1 ; i++){

            System.out.println(items[i].getValue() + items[i+1].getValue());
        }
        input.close();
    }
    
}
