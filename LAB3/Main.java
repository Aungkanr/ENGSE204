package LAB3;

import java.util.Scanner;

import LAB3.lab3_5.DatabaseConnection;
public class Main {
    
    public static void main(String[] dbct) {
    
    Scanner input = new Scanner(System.in);
    String connectionString = input.nextLine();

    DatabaseConnection databaseConnection = new DatabaseConnection (connectionString);

    databaseConnection.connect();
    databaseConnection.disconnect();
    databaseConnection.disconnect();

    System.out.print(databaseConnection.isConnected());
    
    }
}
