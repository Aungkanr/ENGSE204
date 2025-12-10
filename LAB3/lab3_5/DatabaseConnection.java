package LAB3.lab3_5;

public class DatabaseConnection {

    private String connectionString;
    private boolean connected = false;

    public DatabaseConnection (String connection ){

        this.connectionString = connection;
    }
    public boolean isConnected(){
        return connected;
    }
    public void connect(){
        if (!connected) {
            connected = true;
            System.out.println("Connected" + connectionString);
        } else {
            System.out.println("Already connected.");
        }        
    }

    public void disconnect(){
        if (connected) {
            connected = false;
            System.out.println("DisConnected");
        } else {
            System.out.println("Already disconnected.");
        }       
    }
}