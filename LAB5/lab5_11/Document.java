package LAB5.lab5_11;

public class Document {

    protected String title;

    public Document (String title){
        this.title = title;
    }

    public void displayDetails(){
        System.out.print("Document : " + title);
    }
    
}
