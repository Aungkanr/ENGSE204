package LAB2.LAB2p3;
import java.util.Scanner;
public class main {

    public static void main (String[] dtst) {
        Scanner datastudent = new Scanner (System.in);

    int N = datastudent.nextInt();
    datastudent.nextLine();

    for (int d = 0; d < N ; d++ ){

        String ID = datastudent.nextLine();
        String Name = datastudent.nextLine();
        
        Student nakren = new Student(ID , Name) ;
        
        }

        System.out.println(Student.count);
        datastudent.close();
    }
}
