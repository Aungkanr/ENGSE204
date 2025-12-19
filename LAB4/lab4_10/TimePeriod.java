package LAB4.lab4_10;

public class TimePeriod {

    private int statHour;
    private int endHour;
    
    public TimePeriod(){

        this(9,17);

    }

    public TimePeriod(int statHour,int endHour){

        this.statHour = statHour;
        this.endHour = endHour;
            
        if (statHour < 0){
            this.statHour = 0; 
        }else if(statHour > 23){
            this.statHour = 23;
        }

        if (endHour < 0){
            this.endHour = 0; 
        }else if(endHour > 23){
            this.endHour = 23;
        }
        
        if(statHour > endHour){
            this.statHour = endHour;
            this.endHour = statHour;
        }

    }

    public void displayPeriod(){
        System.out.print(this.statHour + " : 00 " + "- " + this.endHour +" : 00");
    }
}
