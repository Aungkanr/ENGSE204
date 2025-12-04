package LAB2.LAB2p10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        ShoppingCart cart = new ShoppingCart();

        for (int k = 0; k < n; k++) {

            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            scanner.nextLine();

            Product product = new Product(name, price);
            cart.addProduct(product);
        }

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total product prices : " + totalPrice);

        scanner.close();
    }
}



