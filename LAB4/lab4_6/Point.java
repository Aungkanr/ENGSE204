package LAB4.lab4_6;

public class Point {

    private final int x;
    private final int y;

    public Point(int x , int y){

        this.x = x;
        this.y = y;
    }

    public int getX(){

        return x;

    }

    public int getY(){

        return y;

    }

    public Point move(int dx ,int dy) {

        int newX = this.x + dx;
        int newY = this.y+ dy;

        return new Point ( newX,newY );

    }

    public void dispalylnfo(){
        System.out.println(x+ "," +y);
        
   }

}
