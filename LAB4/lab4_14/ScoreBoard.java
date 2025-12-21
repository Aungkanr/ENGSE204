package LAB4.lab4_14;

public class ScoreBoard {

    private String gameName;
    private int[]  scores;

    public ScoreBoard(String gameName , int[] scores){

        this.gameName = gameName;
        this.scores = scores;
        
    }
    
    public ScoreBoard(ScoreBoard other){

        this.gameName = other.gameName;
        this.scores = new int[other.scores.length];
        
        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }

    public void displayScores() {

        System.out.print(gameName);

        for (int s : scores) 

        System.out.print(s);
        
        System.out.println();

    }

    
}
