package LAB5.lab5_2;

public class Animal {

    protected String name;
    protected int age;

    public Animal(String name , int age){

        this.name = name;
        this.age = age;
    }

    public void displaylnfo(){

        System.out.println("Name : " + name + " , "+ "Age : " + age);

    }

    
}
