package LAB2.LAB2p1;
import java.util.Scanner;
    public class Student {

    private String ID;
    private String Name;

    public Student ( String idnakren , String Namenakren ) {
    
        ID = idnakren ;
        Name = Namenakren;
    }

    public void displaydataStudent(){

        System.out.println(" idnakren : " + ID );
        System.out.println(" Namenakren : " + Name );
        
    }
}
