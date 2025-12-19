package LAB4.lab4_1;

public class Book {

    private String title;
    private String author;

    public Book (String title){
        
        this.title = title;
        this.author = "unknown";
    }

    public Book (String title , String author){

         this.title = title;
         this.author = author;

    }

    public void  dispalylnfo(){
        System.out.print("Title : " + title);
        System.out.print(", Author : " + author);

    }
    
}
