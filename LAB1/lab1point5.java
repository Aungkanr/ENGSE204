import java.util.Scanner;
    public class lab1point5 {
        public static void main(String[] listnam) {
            
            Scanner input=new Scanner(System.in);
            System.out.print(" number = ");
            int menu = input.nextInt();

            if(menu == 1){
                System.out.println("Americano");
            } else if (menu == 2) {
                System.out.println("Latte");
            } else if (menu == 3) {
                System.out.println("Espresso");        
            } else if (menu == 4) {
                System.out.println("Mocha");
            } else {
                System.out.println(" Invalid Menu");
            }

            input.close();
            }

        }
    
