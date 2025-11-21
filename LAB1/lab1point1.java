import java.util.Scanner;

class Lab1point1 {
    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);
        
        System.out.print("num1 = ");
        int a = ab.nextInt();

        System.out.print("num2 = ");
        int b = ab.nextInt();

        int x = a+b;

        // เอาผลลัพธ์มาบวกเฉยๆ นะ
        System.out.println(x);

        ab.close();
    }
}
