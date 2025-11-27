package LAB2.LAB2p2;

import java.util.Scanner;
    public class Student {

    private String ID;
    private String Name;

    public Student ( String idnakren , String Namenakren ) {
    
        this.ID = idnakren ;
        this.Name = Namenakren;
    }

    public void displayInfo(){

        System.out.println(" idnakren : " + this.ID );
        System.out.println(" Namenakren : " + this.Name );
        
    }
}