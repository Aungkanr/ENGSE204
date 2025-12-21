package LAB4.lab4_15;

public class AuditRecord {

    private final String user ; 
    private final String[] logMessages ;
    private static int maxMessages = 3 ;

    public AuditRecord(String user){
        
        this.user = user;
        this.logMessages = new String[0];

    }

    public AuditRecord(String user, String[] log){

        this.user = user;
        int size = Math.min(log.length, maxMessages);
        this.logMessages = new String[size];

        for(int i = 0; i < size; i++){
             this.logMessages[i] = log[i];
    }
}
    public static void setPolicy(int max){

        if(max > 0){

            maxMessages = max;
            System.out.println("Policy set to " + max);
        }

        else{

            System.out.println("Invalid policy.");
        }
    }
    public AuditRecord addMessage(String message){

        int newSize = Math.min(logMessages.length + 1, maxMessages);
        String[] newLogs = new String[newSize];

        int i = 0 ;
        for( ; i < logMessages.length && i < newSize - 1; i++){
             newLogs[i] = logMessages[i];
        }

        if(i < newSize){
        newLogs[i] = message;

        }

        return new AuditRecord(this.user ,newLogs);

    }
    
    public void displayLog(){

        System.out.print("User: " + user + "," + "Logs:");

        for(int i = 0; i < logMessages.length; i++){

             System.out.print(logMessages.length +" "+ logMessages[i]);
                if(i < logMessages.length - 1){
                    System.out.print(",");

            }
        }
         System.out.println();
    }
}
