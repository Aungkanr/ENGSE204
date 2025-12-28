package LAB5.lab5_11;

import java.util.Scanner;

public class Main {

    public static void main(String[] dopt) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter title TextDocument : ");
        String titleText1 = input.nextLine();
        System.out.print("Enter wordCount : ");
        int wordCount1 = input.nextInt();
        
        input.nextLine();

        System.out.print("Enter title PDFDocument : ");
        String titlePDF1 = input.nextLine();
        System.out.print("Enter pageCount : ");
        int pageCount1 = input.nextInt();

        input.nextLine();

        System.out.print("Enter title TextDocument : ");
        String titleText2 = input.nextLine();
        System.out.print("Enter wordCount : ");
        int wordCount2 = input.nextInt();
        
        input.nextLine();

        System.out.print("Enter title PDFDocument : ");
        String titlePDF2 = input.nextLine();
        System.out.print("Enter pageCount : ");
        int pageCount2 = input.nextInt();
        input.nextLine();

        TextDocument textDocument1 = new TextDocument(titleText1, wordCount1);
        PDFDocument pdfDocument1 = new PDFDocument(titlePDF1, pageCount1);

        TextDocument textDocument2 = new TextDocument(titleText2, wordCount2);
        PDFDocument pdfDocument2 = new PDFDocument(titlePDF2, pageCount2);

        Document[] dataDocuments = new Document[4];
        dataDocuments[0] = textDocument1;
        dataDocuments[1] = pdfDocument1;
        dataDocuments[2] = textDocument2;
        dataDocuments[3] = pdfDocument2;

        int totalPages = 0;

        for(int i = 0 ; i < dataDocuments.length ; i++ ){
            if(dataDocuments[i] instanceof PDFDocument){
                PDFDocument PDFDocument = (PDFDocument) dataDocuments[i];

                totalPages += PDFDocument.pageCount;
                
            }

        }
        for(int i = 0 ; i < dataDocuments.length ; i++ ){
             dataDocuments[i].displayDetails();
        }

        System.out.println("Total Page: " + totalPages);
        
        input.close();
    }
    
}
