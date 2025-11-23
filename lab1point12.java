import java.util.Scanner;
public class lab1point12 {
    public static void main(String[] mange) {
        Scanner input = new Scanner(System.in);

        System.out.print(" tok kansai ki sanid  : ");
        int magm = input.nextInt();

        int[] ProductId = new int[magm];
        int[] Stock = new int[magm];

        for (int M = 0 ; M < magm ; M++){
            System.out.println("Sai Ai Di : " +(M+1));
            ProductId[M] = input.nextInt();

            System.out.println("Sai sa tok : " +(M+1));
            Stock[M] = input.nextInt();
        }
        
        System.out.println("Sai Id ti thong kan ha");
        int lek = input.nextInt();

        int M;
        boolean  found = false;
        for ( M = 0; M < magm; M++ )  {
            if (lek == ProductId[M]){
                System.out.printf(" mi khong nai Stock %d Piece : ",Stock[M]);
                found = true;
                break;
            }
        }

            if ( !found ) {
                System.out.printf("Product  not found", lek);
            }
                input.close();
    }
}