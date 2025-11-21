import java.util.Scanner;
    class lab1point2 {
        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            
            System.out.print("Please enter a Width value = ");
            Double wid = num.nextDouble();

            System.out.print("Please enter a Height value = ");
            Double high = num.nextDouble();

            System.out.print(high*wid);

            num.close();
            

        }
    }