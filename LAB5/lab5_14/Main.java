package LAB5.lab5_14;

import java.util.Scanner;

public class Main {

    public static void main(String[] pssh) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter idstd : ");
        String idstd = input.nextLine();
        System.out.print("Enter baseFeestd : ");
        double baseFeestd = input.nextDouble();


        System.out.print("Enter idpre : ");
        String idpre = input.nextLine();
        System.out.print("Enter baseFeepre : ");
        double baseFeepre = input.nextDouble();
        System.out.print("Enter insuranceFeepre : ");
        double insuranceFeepre = input.nextDouble();


        StandarShipping shipping = new StandarShipping(idstd, baseFeestd);
        PremiumShipping pShipping = new PremiumShipping(idpre, baseFeepre, insuranceFeepre);

        Shipping[] Shippings = new Shipping[2];

        Shippings[0] = shipping;
        Shippings[1] = pShipping;


        for (Shipping s : Shippings ){

            System.out.print("ID : " + s.trackingID + " Total Fee : " + s.calculateTotalFee());
        }
        
        input.close();
    }
    
}
