package LAB2.LAB2p5;

    class Rectangle {
    
    private double width;
    private double height;

    public Rectangle ( double wid , double hei ) {

        this.width = wid;
        this.height = hei;
    }

    public double getArea (){

        double komnun = ( width * height);
        return komnun;
    }

    public double getPerimeter () {
        double perimeter = ( width * height);
        return 2 * ( width + height );
    }

}

