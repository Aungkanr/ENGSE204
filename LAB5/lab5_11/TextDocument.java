package LAB5.lab5_11;

public class TextDocument extends Document {
    
    protected int wordCount;

    public TextDocument(String title , int wordCount){

        super(title);
        this.wordCount = wordCount;

    }

    public void displayDetails(){

        System.out.println("Text : " + title + ", Words : " + wordCount);

    }

}
