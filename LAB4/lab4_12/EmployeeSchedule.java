package LAB4.lab4_12;

public class EmployeeSchedule {

    private String name;
    private Schedule schedule;

    public EmployeeSchedule(String name ,Schedule schedule){

        this.name = name;
        this.schedule = schedule;
    }

    public EmployeeSchedule(EmployeeSchedule other){

        this.name = other.name;
        this.schedule = new Schedule(other.schedule.getStatHour());
    }

    public void displaySchedule() {

        System.out.println(name + " : " + schedule.getStatHour() + " : 00");
    }

    
}
