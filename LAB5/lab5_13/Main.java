package LAB5.lab5_13;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] adus) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter nameDeveloper : ");
        String nameDev = input.nextLine();
        System.out.print("Enter projectsDeveloper : ");
        int projectsDev = input.nextInt();

        input.nextLine();

        System.out.print("Enter nameAdmin : ");
        String nameAdmin = input.nextLine();
        System.out.print("Enter projectsAdmin : ");
        int projectsAdmin = input.nextInt();
        System.out.print("Enter projectsAdmin : ");
        String adminKey = input.nextLine();



        User u1 = new User( "Guest" );
        Developer d1 = new Developer(nameDev, projectsDev);
        Admin a1 = new Admin(nameAdmin,adminKey,projectsAdmin);

        User[] users = new User[3];

        users[0] = u1;
        users[1] = d1;
        users[2] = a1;

        int TotalClearance = 0;
        
        for (User us : users ){
             TotalClearance = us.getClearanceLevel();
        for (User u : users ){
            if( u instanceof Admin){
                Admin ad = (Admin) u;
                System.out.print(ad.getAdminKey());
            } 
        }

        System.out.print("Total Clearance" + TotalClearance);
    
        input.close();
        
    }
}
}
