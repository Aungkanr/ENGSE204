import java.util.Scanner;
    class lab1point2 {
        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            
            System.out.print(" Width = ");
            Double wid = num.nextDouble();

            System.out.print(" Height  = ");
            Double high = num.nextDouble();

            System.out.print(high*wid);

            num.close();
            

        }
    }