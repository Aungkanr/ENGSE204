package LAB4.lab4_11;

public class Configuration {
    
    private String theme;
    private int fontSize;
    private boolean darkmode;

    public Configuration(String theme,int fontSize,boolean darkmode){

        this.theme = theme;
        this.darkmode = darkmode;

        if(fontSize < 10){
            this.fontSize = 10;
        } else if(fontSize > 20){
            this.fontSize = 20;
        }else {
            this.fontSize = fontSize;
        }


    }

    public Configuration(Configuration base , Configuration user){

        this.theme = user.theme;
        this.fontSize = base.fontSize;
        this.darkmode = user.darkmode;
    }

    public void displaySettings (){

        System.out.println("Theme : " + this.theme  + " , Size : " + this.fontSize + " , Dark : " + this.darkmode);
    }
}
