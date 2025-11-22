import java.util.Scanner;
    public class lab1point5 {
        public static void main(String[] nam) {
            
            Scanner input=new Scanner(System.in);
            System.out.print(" number = ");
            int menunum = input.nextInt();

            if(menunum == 1){
                System.out.println("Americano");
            } else if (menunum == 2) {
                System.out.println("Latte");
            } else if (menunum == 3) {
                System.out.println("Espresso");        
            } else if (menunum == 4) {
                System.out.println("Mocha");
            } else {
                System.out.println(" Invalid Menu");
            }

            input.close();
            }

        }
    
