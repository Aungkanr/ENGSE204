package LAB2.LAB2p1;
import java.util.Scanner;

public class main {
    public static void main (String[] ddta) {

    Scanner Data=new Scanner (System.in);
    
    System.out.print(" Enter ID nakren : ");
        String ID = Data.nextLine();

        System.out.print("Enter Name nakren : ");
        String Name = Data.nextLine();
        
        Student nakren = new Student(ID , Name) ;

        Data.close();
    }
}