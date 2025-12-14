package LAB3.lab3_7;
import java.util.Scanner;

public class Main {
    public static void main(String[] emid) {
    Scanner input = new Scanner(System.in);

    String IDemployee = input.nextLine();
    String departold = input.nextLine();
    String departnew = input.nextLine();

    EmployeeID dataEmployee = new EmployeeID(IDemployee, departold);
        
    dataEmployee.setDepartment(departnew);
    
    System.out.println(dataEmployee.getEmploydeeId());
    System.out.println(dataEmployee.getDeparment());

    input.close();
        
    }
}
