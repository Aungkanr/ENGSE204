package LAB4.lab4_13;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] ssip) {
        
        Scanner input = new Scanner(System.in);
        
        int max = input.nextInt();
        Subscription.setMaxDuration(max);
        System.out.println(max);
        input.nextLine(); 
 
        String plan = input.nextLine();
        
        int d1 = input.nextInt();
        Subscription ss = new Subscription(plan, d1);
        
        int d2 = input.nextInt();
        ss = ss.extend(d2); 

        int d3 = input.nextInt();
        ss = ss.extend(d3);

        ss.displaylnfo();
        input.close();
    }
}
