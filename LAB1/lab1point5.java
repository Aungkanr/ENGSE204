import java.util.Scanner;
    public class lab1point5 {
        public static void main(String[] args) {
            
            Scanner input=new Scanner(System.in);
            System.out.print(" Please number = ");
            int list = input.nextInt();

            if(list == 1){ //เป็นการกำหนดให้ ตัวแปร รับค่าจากผู็ใช้
                System.out.println("Americano");
            } else if (list == 2) {
                System.out.println("Latte");
            } else if (list == 3) {
                System.out.println("Espresso");        
            } else if (list == 4) {
                System.out.println("Mocha");
            } else {
                System.out.println(" Invalid Menu");
            }

            input.close();
            }

        }
    
