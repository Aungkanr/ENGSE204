package LAB4.lab4_14;

import java.util.Scanner;

public class Main {
    
     public static void main(String[] scb) {
        
        Scanner input = new Scanner(System.in);
        String gameName ;
        int score1 ,score2,score3,score4;

        gameName = input.nextLine();

        score1 = input.nextInt();
        score2 = input.nextInt();
        score3 = input.nextInt();

        int arr[] = {score1,score2,score3};
        ScoreBoard sb1 = new ScoreBoard(gameName,arr);
        ScoreBoard sb2 = new ScoreBoard(sb1);

        score4 = input.nextInt();
        arr[0]= score4;


        sb1.displayScores();
        sb2.displayScores();
        input.close();
    }
}
