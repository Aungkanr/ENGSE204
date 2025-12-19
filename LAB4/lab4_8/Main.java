package LAB4.lab4_8;

import java.util.Scanner;

public class Main {

    public static void main(String[] nung) {
        
        Scanner input = new Scanner(System.in);

        int mode = input.nextInt();
        input.nextLine();

        if(mode == 1){

            String title = input.nextLine();
            Movie movie = new Movie(title);
            movie.displayDetails();
        } else if(mode == 2){
            
            String title = input.nextLine();
            String director = input.nextLine();
            Movie movie = new Movie(title,director);
            movie.displayDetails();
        } else if( mode == 3) {

            String title = input.nextLine();
            String director = input.nextLine();
            double rating = input.nextDouble();
            Movie movie = new Movie(title,director,rating);
            movie.displayDetails();
        } else {
            
        }
        
        input.close();
    }
    
}
