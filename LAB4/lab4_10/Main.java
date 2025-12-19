package LAB4.lab4_10;

import java.util.Scanner;

public class Main {

    public static void main(String[] tpd) {
        
        Scanner input = new Scanner(System.in);
        int mode = input.nextInt();
        

        if(mode == 1){
            TimePeriod time = new TimePeriod();
            time = new TimePeriod();
            time.displayPeriod();
        } 

        if(mode == 2){

            int statHour = input.nextInt();
            int endHour = input.nextInt();
            TimePeriod time = new TimePeriod(statHour,endHour);
            
            time.displayPeriod();
        }
        
            input.close();
    }
    
}
