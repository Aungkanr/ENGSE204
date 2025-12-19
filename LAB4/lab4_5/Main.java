package LAB4.lab4_5;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] clro) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Red : ");
        int R = input.nextInt();
        System.out.print("Enter Green : ");
        int G = input.nextInt();
        System.out.print("Enter Blue : ");
        int B = input.nextInt();
        
        Color color = new Color(R,G,B);

        color.displayRGB();

        input.close();
    }
}
