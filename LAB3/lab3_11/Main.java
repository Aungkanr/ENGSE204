package LAB3.lab3_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();

       for(int i = 0 ; i < n ; i++){
            String operation = input.next();
            SystemConfig config = SystemConfig.getInstance();
            
            if(operation.equalsIgnoreCase("SET_URL")){
                String url = input.next();
                config.setServerUrl(url);
            }
            else if(operation.equalsIgnoreCase("SET_MAX")){
                int maxConn = input.nextInt();
                config.setMaxConnections(maxConn);
            }
            else if(operation.equalsIgnoreCase("SHOW")){
                System.out.println(config.getServerUrl());
                System.out.println(config.getMaxConnections());

            }

       }
         input.close();
    }
}

