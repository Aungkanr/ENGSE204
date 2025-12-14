package LAB3.lab3_8;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] stpd) {
        
        Scanner input = new Scanner(System.in);

        String nameproduct = input.nextLine();
        int storkstat = input.nextInt();

        int n = input.nextInt();

        lnventoryitem inventory = new lnventoryitem (nameproduct,storkstat);
        
        
        for(int i = 0; i < n;i++){

        input.nextLine();
        String datastork = input.nextLine();

            if(datastork.equalsIgnoreCase("ADD") ){
            
            int amount = input.nextInt();

            inventory.addStock(amount);
              
         }
            else if(datastork.equalsIgnoreCase("SELL") ){
            
            int amount = input.nextInt();
            inventory.sellStock(amount);
         }
    }
         System.out.println("Final Stock : "+ inventory.getStock());
         input.close();
  }  
}
