package LAB3.lab3_13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner data9 = new Scanner (System.in);
       
         int value9 = data9.nextInt();
            for(int i = 0; i < value9; i++){
                String operation9 = data9.next();
                if(operation9.equalsIgnoreCase("SET")){
                    int max = data9.nextInt();
                    LicenseManager.setMax(max);
                }
                else if(operation9.equalsIgnoreCase("CHECKOUT")){
                   LicenseManager.checkOut1();
                }
                else if(operation9.equalsIgnoreCase("CHECKIN")){
                    LicenseManager.checkIn();
                }
                else if(operation9.equalsIgnoreCase("STATUS")){
                    LicenseManager.displayStatus();
                }
            }
            data9.close();
         }
    
}
