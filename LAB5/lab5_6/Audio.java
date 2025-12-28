package LAB5.lab5_6;

public class Audio extends Media {

    protected String quality;

    public Audio(String title , String quality){
        
        super(title);
        this.quality = quality;
    
    }

    public void process(){

        System.out.println("Processing audio : " + title + " , " + "with " + quality + " quality. ");
    }
 
}
