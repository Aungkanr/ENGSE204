package LAB4.lab4_3;

public class Player {

    private String username;
    private int leval;

    public Player(){

        this.username = "Guest";
        this.leval = 1;
    }

    public Player (String username , int leval){
        this.username = username;
        this.leval = leval;
    }

    public void displayProfile(){

        System.out.print("User : " + username );
        System.out.print(", Leval : " + leval);
    }
    
}
