package LAB3.lab3_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] prodp) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        for (int k = 0; k < n; k++) {

            String nameProduct = input.nextLine(); 
            Product product = new Product(nameProduct);

        }
        
            System.out.println(Product.getProductCount());
            input.close();
    }
}
