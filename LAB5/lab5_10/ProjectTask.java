package LAB5.lab5_10;

public class ProjectTask {

    protected String description;
    protected int baseHours;

    public ProjectTask (String description, int baseHours ){

        this.description = description;
        this.baseHours = baseHours ;

    }
    
    public double calculateCost(){
        return baseHours*50.0 ;
    }
}
