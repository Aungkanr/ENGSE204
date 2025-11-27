package LAB2.LAB2p2;
    public class Student {

    private String IDstudent;
    private String Namestudent;

    public Student ( String idnakren , String Namenakren ) {
    
        this.IDstudent = idnakren ;
        this.Namestudent = Namenakren;
    }

    public void displayInfo(){

        System.out.println(" idnakren : " + this.IDstudent );
        System.out.println(" Namenakren : " + this.Namestudent );
        
    }
}