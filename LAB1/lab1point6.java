import java.util.Scanner;
    public class lab1point6 {
        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            System.out.print(" Please number = ");
            int mul = input.nextInt();

            for(int mom = 1 ; mom <= 12 ; mom++){

                System.out.printf(" %d x %d =  %d \n", mul , mom , mul*mom); // %d เป็นการแสดง

            }

            input.close();
        }
        
    }