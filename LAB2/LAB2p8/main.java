package LAB2.LAB2p8;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] aunahp) {
        
        Scanner input = new Scanner(System.in);
        String mode = input.nextLine();
        double temperature = input.nextDouble();

        if (mode.equals("C TO F")){
            System.out.printf("%.1f\n" ,TempConverter.celsiusToFahrenheit(temperature));
        } else if ( mode.equals("F TO C" )) {
            System.out.printf("%.1f\n" ,TempConverter.fahrenheitTocelsius(temperature));
        }
            input.close();
        }
     }


