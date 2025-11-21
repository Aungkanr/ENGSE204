import java.util.Scanner;
public class lab1point4 {
    public static void main(String[] args) {

        Scanner ga=new Scanner(System.in);
            System.out.print("Please enter your score. = ");
            int score=ga.nextInt();
            if( score >= 80 ){
                System.out.println(" Garde A ");
            } else if ( score >= 75 && score < 80 ){
                System.out.println(" Garde B+ ");

            } else if ( score >= 70 && score < 75 ){
                System.out.println(" Garde B ");

            } else if ( score >= 65 && score < 70 ){
                System.out.println(" Garde C+ ");

            } else if ( score >= 60 && score < 65 ){
                System.out.println(" Garde C ");

            } else if ( score >= 55 && score < 60 ){
                System.out.println(" Garde D+ ");

            } else if ( score >= 50 && score < 55 ){
                System.out.println(" Garde D ");
            } else {
                System.out.println(" Garde F ");
            }
                
                ga.close();
        
        }
    }
