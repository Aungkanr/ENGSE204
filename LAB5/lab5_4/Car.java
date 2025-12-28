package LAB5.lab5_4;

public class Car extends Vehicle {

    protected int wheels;

    public Car(String color,int wheels){

        super(color);
        this.wheels = wheels;

    }

    public void displayDetails(){
        System.out.print("Color : " + this.color + " , " + "Wheels : " + this.wheels);
    }
    
}
