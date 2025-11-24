import java.util.Scanner;
public class lab1point13 {
    public static void main(String[] kka) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int k = input.nextInt();
        int[][]arr = new int[a][k];

        for (int u = 0; u < a; u++) { 
            for (int n = 0; n < k; n++) {
                arr[u][n] = input.nextInt();
            }
        }

        int count = 0;
        for (int u = 0; u < a; u++) {
            for (int n = 0; n < k; n++) {
                if (arr[u][n] == 1) {
                    count++;

         }
    }
 }

        System.out.println(count);
        input.close();
    }
}
