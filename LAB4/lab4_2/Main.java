package LAB4.lab4_2;

import java.util.Scanner;

import LAB4.lab4_1.Book;

public class Main {
    
    public static void main(String[] prdu) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        input.nextLine();

        if( m == 1 ){
            String name = input.nextLine();
            Product product = new Product(name);
            product.dispalylnfo();
            
        } else if( m == 2) {

            String name = input.nextLine();
            double price = input.nextDouble();

            Product product = new Product(name,price);
            product.dispalylnfo();
        }else{
             System.out.printf("mode 1 or mode 2");
        }
            input.close();


    }
}
