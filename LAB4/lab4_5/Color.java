package LAB4.lab4_5;

public class Color {

    private int red;
    private int green;
    private int blue;

    public Color(int r, int g ,int b){
        
        this.red = r ;
        this.green = g ;
        this.blue = b ;
    
        if( red < 0 ){
            red = 0;
        }else if (red > 255){
            red = 255;
        }

        if( green < 0 ){
            green = 0;
        }else if (green > 255){
            green = 255;
        }

        if( blue < 0 ){

            blue = 0;
        }else if (blue > 255){
            blue = 255;
        }

    }

    public int getRed(){
            return red;
        }
        public int getGreen(){
            return green;
        }
        public int getBlue(){
            return blue;
        }

        public void displayRGB(){
            System.out.println("R = " + red + " G = " + green + " B = " + blue);
        }
}
