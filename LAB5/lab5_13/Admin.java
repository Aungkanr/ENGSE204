package LAB5.lab5_13;

public class Admin extends User {

    protected String adminKey;
    protected int projects;

    public Admin (String name , String adminKey ,int projects){

        super(name);
        this.adminKey = adminKey;
        this.projects = projects;

    }

    @Override
    public int getClearanceLevel(){
        return 3 ;
    }

    public String getAdminKey(){
        return adminKey;
    }
    
}
