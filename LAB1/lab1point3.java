import java.util.Scanner ;
    public class lab1point3 {
    public static void main(String[] args) {
    
        Scanner lo=new Scanner(System.in);
            System.out.print(" Please enter number = ");
            int number=lo.nextInt();
            if(number%2 == 0 ){
                System.out.println(" Even ");
            }else{
                System.out.println(" odd ");
                
                lo.close();
            
            } 
        }
    }
