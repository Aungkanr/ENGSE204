import java.util.Scanner;

class Lab1point1 {
    public static void main(String[] lek) {

        Scanner nw = new Scanner(System.in);
        
        System.out.print("num1 = ");
        int a = nw.nextInt();

        System.out.print("num2 = ");
        int b = nw.nextInt();

        int x = a+b;

        System.out.println(x);

        nw.close();
    }
}
