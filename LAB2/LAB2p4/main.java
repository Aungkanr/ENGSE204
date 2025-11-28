package LAB2.LAB2p4;

import java.util.Scanner;

public class main {
    public static void main(String[] asrv) {
        
        Scanner input=new Scanner(System.in);
        String name = input.nextLine();
        
        int ScoreMidteam = input.nextInt();
        int ScoreFinal = input.nextInt();

        Student agv = new Student(name , ScoreMidteam ,ScoreFinal) ;

        agv.displaySummary();

        
    }
}
