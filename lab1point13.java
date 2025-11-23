import java.util.Scanner;
public class lab1point13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r = input.nextInt();
        int c = input.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) { 
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
        input.close();
    }
}
