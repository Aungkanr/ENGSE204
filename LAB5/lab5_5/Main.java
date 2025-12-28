package LAB5.lab5_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] crcs) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter redius : ");
        double redius = input.nextDouble();
        System.out.print("Enter width : ");
        double width = input.nextDouble();
        System.out.print("Enter height : ");
        double height = input.nextDouble();

        Circle circle = new Circle ("Circle",redius);
        Rectangle rectangle = new Rectangle("Rectangle",width, height);

        Shape[] shapeArea = new Shape[2];
        shapeArea[0] = circle;
        shapeArea[1] = rectangle;

        for (Shape Area : shapeArea){
            System.out.println(Area.calculateArea());
        }

        input.close();
    }
}
