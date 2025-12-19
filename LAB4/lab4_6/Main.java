package LAB4.lab4_6;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] pont) {
        
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int dx = input.nextInt();
        int dy = input.nextInt();

        Point p1 = new Point(x,y);
        Point p2 = p1.move(dx,dy);
        Point p3 = p2.move(dx,dy);

        p1.dispalylnfo();
        p2.dispalylnfo();
        p3.dispalylnfo();

        p1 = null;
        p2 = null;
        p3 = null;
        
        input.close();
    }
}
