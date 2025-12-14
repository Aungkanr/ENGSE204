package LAB3.lab3_10;

import java.util.Scanner;

public class main {
    public static void main(String[] SYLOR){
        Scanner input = new Scanner(System.in);

        int s = input.nextInt();
        input.nextLine();

        for (int i = 0 ; i < s; i++ ){

            String sr = input.nextLine().trim();

            if (sr.equalsIgnoreCase("SET")){

                int set = input.nextInt();
                SystemLogger.setLogLevel(set);
                input.nextLine();

            }else if( sr.equalsIgnoreCase("LOG")){

                int log = input.nextInt();
                input.nextLine();

                String logm = input.nextLine();
                SystemLogger.log(log,logm);

            }else {
                System.out.println(sr);
            }
        
        }
        input.close();
        }
    }

