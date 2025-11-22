import java.util.Scanner;
    public class lab1point7 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print(" value = "); 
            int num = input.nextInt(); 
            int sum = 0;

            for(int value = 1 ; value <= num ; value++ ){ 
                int numbee = input.nextInt();
                sum += numbee ;
        
            }
            System.out.println("answer = "+sum);
            input.close();
        }
    }
