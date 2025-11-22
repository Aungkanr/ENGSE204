import java.util.Scanner ;
    public class lab1point3 {
    public static void main(String[] exam) {
    
        Scanner eo=new Scanner(System.in);
            System.out.print(" enter num = ");
            int number=eo.nextInt();
            if(number%2 == 0 ){
                System.out.println(" Even ");
            }else{
                System.out.println(" odd ");
                
                eo.close();
            
            } 
        }
    }
