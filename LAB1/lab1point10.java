import java.util.Scanner;
public class lab1point10 {
    public static void main(String[] wihe) {
        Scanner input=new Scanner (System.in);
        
        System.out.print("width value : ");
        double wid = input.nextDouble();

        System.out.print("high value : ");
        double high = input.nextDouble();

        double Average = calculatearea(wid , high);

        System.out.println(Average);


    }
     public static double calculatearea(double wid, double high) {
        Scanner num = new Scanner(System.in);

            double area = high * wid ;
    
            return area;
     }
}