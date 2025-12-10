package LAB3.lab3_3;

public class User {

    private String password;

    public User (String initialScore){

        this.password = initialScore;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String newPassword){
        if (newPassword.length()>=  8 ){
            this.password = newPassword;
            System.out.println("Password updated ");
        } else {
            System.out.println("Password iss too short");
        }
    

    
    }
}
