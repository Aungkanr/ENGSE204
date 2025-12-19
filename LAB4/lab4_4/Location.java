package LAB4.lab4_4;

public class Location {

    private double latitude;
    private double longitude;

    public Location (double latitude,double longitude){

        this.latitude = latitude;
        this.longitude = longitude;

    }
    
    public Location(Location other){

        this.latitude = other.latitude;
        this.longitude = other.longitude;
    }

    public void setLatitude(double newLat){

        this.latitude = newLat;

    }
    public void dispalylnfo(){

        System.out.println("Lat : " + latitude + ", Lon :" + longitude );
    }
}
