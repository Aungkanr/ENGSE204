package LAB5.lab5_8;

public class Student extends Person {

    protected int Studentid;

    public Student(String name , int Studentid){

        super(name);
        this.Studentid = Studentid;

    }

    public String getStatus(){

        return "Student :" + name + " ID : " + Studentid;

    }

}
