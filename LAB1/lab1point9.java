import java.util.Scanner;
public class lab1point9 {
    public static void main(String[] rage) {

        Scanner input = new Scanner(System.in);
        System.out.print(" value :");
        int value = input.nextInt();
        int[] sum = new int[value];
        double Average = 0;

        for (int A = 0 ; A < value; A++){
            sum [A] = input.nextInt();
                Average += sum [A];             

            }
            
        System.out.println(" Average result  = " + Average / value );
        input.close();
    }
}
    
