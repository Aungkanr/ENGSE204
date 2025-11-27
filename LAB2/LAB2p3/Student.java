package LAB2.LAB2p3;
public class Student {

    private String iD;
    private String name;

    public static int count = 0;

     public Student ( String IDStudent , String NameStudent ) {
    
        this.iD = IDStudent ;
        this.name = NameStudent;
        count ++;
     
    }

        public void displayIdata(){

        System.out.println(" idnakren : " + this.iD );
        System.out.println(" Namenakren : " + this.name );
    }    
}