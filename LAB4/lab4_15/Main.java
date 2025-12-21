package LAB4.lab4_15;
import java.util.Scanner;

public class Main {

    public static void main(String[] audi) {
        Scanner input = new Scanner(System.in);

        int max = input.nextInt();
        input.nextLine();

        String user = input.nextLine();

        AuditRecord.setPolicy(max);
        AuditRecord myLogger = new AuditRecord(user);

        int n = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < n; i++) {

            String kf = input.nextLine();

            myLogger.addMessage(kf);
        }

        myLogger.displayLog();
        
        input.close();
    }

    
}
