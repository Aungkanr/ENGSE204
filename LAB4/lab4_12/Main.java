package LAB4.lab4_12;

import java.util.Scanner;

public class Main {

    public static void main(String[] emsc) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name : ");
        String nameEmployee = input.nextLine();
        System.out.print("Enter statHour : ");
        int StatHour = input.nextInt();
        System.out.print("Enter newHour : ");
        int NewHour = input.nextInt();
        

        Schedule sch1 = new Schedule(StatHour);

        EmployeeSchedule emp1 = new EmployeeSchedule(nameEmployee,sch1);
        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);

        sch1.setStatHour(NewHour);
        emp1.displaySchedule();
        emp2.displaySchedule();

        input.close();
        
    }
    
}
