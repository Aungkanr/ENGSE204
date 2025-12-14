package LAB3.lab3_9;

public class User {

    private String username;
    private String password;

    private static int minPasswordLengh = 8;

    public static void setMinLength(int length){
        
        if (length < 4 ){
            System.out.println(" Invalid length. ");
        } else if ( length >= 4 ) {
            minPasswordLengh = length;
            System.out.println("New min length set to." + minPasswordLengh);
        }
    }

    public User (String name,String passwordold){

        this.username = name;
        if (passwordold.length() >= minPasswordLengh ){
            this.password = passwordold;
            System.out.println("Creation successful. ");
        } else {
            this.password = " Invalid ";
            System.out.println("Creation fail. ");
        }
    }

    public void setPassword(String newPassword){
        if (newPassword.length() > minPasswordLengh ){
            this.password = newPassword;
            System.out.println("Update successsful. ");
        } else {
            System.out.println("Update fail. ");
        }
    }

    public String getPassword(){
        return password;
    }
}
