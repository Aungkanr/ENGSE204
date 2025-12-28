package LAB5.lab5_5;

public class Circle extends Shape {

    protected double redius;

    public Circle(String name ,double redius){

        super(name);
        this.redius  = redius;
    }

    public double calculateArea(){
        return 3.14159 *redius *redius; 
    }


    
}
