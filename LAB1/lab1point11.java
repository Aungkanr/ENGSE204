import java.util.Scanner;
public class lab1point11 {

    public static void main(String[] arsuy) {
        Scanner input = new Scanner(System.in);

        System.out.print(" enter num = ");
        int sum = input.nextInt();

        int[] num = new int[sum];   
         for (int S = 0 ; S < sum ; S++) {
            num [S] = input.nextInt();

        }      
        int array = sumArray(num);
        
        System.out.println(" ans = " +array);

        input.close();

    }    


        public static int sumArray (int[] arr){
            int sumNumber = 0 ;
            for (int S = 0 ; S < arr.length ; S++ ) {
            sumNumber += arr[S];
            
            }        
            return sumNumber ;
        }

    }