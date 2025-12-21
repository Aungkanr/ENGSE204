package LAB4.lab4_13;

import LAB4.lab4_12.Schedule;

public class Subscription {

    private final String planName;
    private final int durationDays;

    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {

        this.planName = planName;

        if (durationDays > maxDuration) {
        this.durationDays = maxDuration;

        } else if (durationDays < 0) {
        this.durationDays = 0;
        
        } else {
        this.durationDays = durationDays;
    }
}

    
    public Subscription(Subscription other ){

        this.planName = other.planName;
        this.durationDays = other.durationDays;

    }

    public static void setMaxDuration(int max){

        if( max > 0 ){
            maxDuration = max;
        }else if( max < 0){
            System.out.print("lnvalid max policy. ");
        }
    }

    public Subscription extend(int days){

        if (days <= 0){
            System.out.print("lnvalid extension days. ");
            return this;
        }

            int newDuration = this.durationDays + days;
            
        if( newDuration > maxDuration) {
            
            System.out.print("Extension failed: Exceeds max policy. ");
            return this;
        }
            return new Subscription(this.planName, newDuration);
            
        }

        public void displayScore(){

            System.out.println("Plan : " + planName + "Days : " + durationDays);
        }
    }



