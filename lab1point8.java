import java.util.Scanner;
public class lab1point8{
    public static void main (String[] Mxmm){

        Scanner input = new Scanner(System.in);
        System.out.print(" value = ");
        int value = input.nextInt();
        int[] sum = new int [value] ;
        int max = 0;
         
        for ( int N = 0 ; N < value; N++ ){ 
            sum [N]  = input.nextInt();
            if(sum[N] > max ) {
                max = sum[N];
            }
        }

        System.out.println("value hight = " + max );
        input.close();
    }
}