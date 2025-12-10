package LAB3.lab3_5;

public class DatabaseConnection {

    private String connectionString;
    private static boolean connected = false;

    public DatabaseConnection (String connection ){

        this.connectionString = connection;
    }
    
    
}
