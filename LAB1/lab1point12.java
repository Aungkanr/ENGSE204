import java.util.Scanner;
public class lab1point12 {
    public static void main(String[] mast) {

        Scanner input = new Scanner(System.in);
        System.out.print(" tok kansai ki sanid  : ");
        int magm = input.nextInt();

        int[] ProductId = new int[magm];
        int[] Stock = new int[magm];

        for (int s = 0 ; s < magm ; s++){
            System.out.println("Sai Ai Di : " +(s+1));
            ProductId[s] = input.nextInt();

            System.out.println("Sai sa tok : " +(s+1));
            Stock[s] = input.nextInt();
        }
        
        System.out.println("Sai Id ti thong kan ha");
        int lek = input.nextInt();

        int m;

        boolean  found = false;
        for ( m = 0; m < magm; m++ )  {
            if (lek == ProductId[m]){
                System.out.printf(" mi khong nai Stock %d Piece : ",Stock[m]);
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