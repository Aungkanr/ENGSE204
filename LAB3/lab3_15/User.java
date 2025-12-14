package LAB3.lab3_15;

public class User {
    private String username;
    private int failedAttempts;
    private boolean isLocked;

    private static int maxAttempts = 3;

    public User(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public static void setPolicy(int max){
        if(max > 0){
            maxAttempts = max;
            System.out.println("Policy updated. Max attempts: " );
        }
        else {
            System.out.println("Invalid Policy.");
        }
    }

    public void login(String password){
        if(isLocked){
            System.out.println("Account is locked.");
            return;
        }

        if(password.equals("pass123")){
            failedAttempts = 0;
            System.out.println("Login successful.");

        } else {
            failedAttempts++;
                 if(failedAttempts >= maxAttempts){
                     isLocked = true;
                     System.out.println("Account is now locked.");
            }
            else{
                failedAttempts = maxAttempts - failedAttempts ;
                System.out.println("Login failed. Attempt " + failedAttempts +" Attempts  lift.");
            }
        }
    }
}

