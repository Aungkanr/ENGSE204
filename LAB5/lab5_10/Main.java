package LAB5.lab5_10;

import java.util.Scanner;

public class Main {

    public static void main(String[] cops) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter description ComplexTask : ");
        String descriptionComplexTask = input.nextLine();
        System.out.print("Enter baseHours ComplexTask : ");
        int baseHoursComplexTask = input.nextInt();
        System.out.print("Enter setupFee : ");
        double setupFee = input.nextDouble();

        input.nextLine();
        System.out.print("Enter description SimpleTask : ");
        String descriptionSimpleTask = input.nextLine();
        System.out.print("Enter baseHours SimpleTask : ");
        int baseHoursSimpleTask = input.nextInt();

        ComplexTask complexTask = new ComplexTask(descriptionComplexTask, baseHoursComplexTask, setupFee);
        SimpleTask simpleTask = new SimpleTask(descriptionSimpleTask, baseHoursSimpleTask);

        ProjectTask[] projectTasks  ={complexTask,simpleTask};

        for(int i = 0 ; i < projectTasks.length ; i++){
            System.out.println(projectTasks[i].calculateCost());
        }

        input.close();
    }
    
}
