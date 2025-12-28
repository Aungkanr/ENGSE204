package LAB5.lab5_8;

import java.util.Scanner;

public class Main {
     
    public static void main(String[] epss) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter nameStudent : ");
        String nameStudent = input.nextLine();
        System.out.print("Enter idStudent : ");
        int idStudent = input.nextInt();

        input.nextLine();

        System.out.print("Enter nameEmployee : ");
        String nameEmployee = input.nextLine();
        System.out.print("Enter salaryEmployee : ");
        double salaryEmployee = input.nextDouble();

        Student student = new Student(nameStudent,idStudent);
        Employee employee = new Employee(nameEmployee, salaryEmployee);

        Person[] peopleps = new Person[2];
        peopleps[0] = student;
        peopleps[1] = employee;
        
        for(int i = 0 ; i < peopleps.length ; i++){

         if(peopleps[i] instanceof Employee){

            Employee employees = (Employee) peopleps[i];
            employees.applyBonus(1000.0);
         } else {

         }
    }

        for (Person sp : peopleps){
            System.out.println(sp.getStatus());
            }
        }
    }
