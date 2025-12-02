package LAB2.LAB2p5;

import java.util.Scanner;

public class main {
    
    public static void main (String[] cula){

        Scanner input=new Scanner(System.in);

        double width = input.nextDouble();
        double height = input.nextDouble();

        Rectangle call = new Rectangle(width , height);

        System.out.println(call.getArea());
        System.out.println(call.getPerimeter());
        
    }
}

