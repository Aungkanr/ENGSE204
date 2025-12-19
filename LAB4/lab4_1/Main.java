package LAB4.lab4_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] book1) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        input.nextLine();

        if( m == 1 ){
            String title = input.nextLine();
            Book book = new Book(title);
            book.dispalylnfo();

        } else if( m == 2) {

            String title = input.nextLine();
            String athor = input.nextLine();

            Book book = new Book(title,athor);
            book.dispalylnfo();
        }else{
             System.out.printf("mode 1 or mode 2");
        }
            input.close();
    }
}
