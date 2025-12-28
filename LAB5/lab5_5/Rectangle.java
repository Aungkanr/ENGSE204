package LAB5.lab5_5;

public class Rectangle extends Shape {

    protected double width;
    protected double height;

    public Rectangle(String name , double width , double height){

        super(name);

        this.width  = width;
        this.height = height;
    }

    public double calculateArea(){

        return width*height;

    }
}
