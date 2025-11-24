import java.util.*;
public class lab1point14{
    public static void main(String[] mspr) {
        Scanner sc = new Scanner(System.in);

        
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine(); 

        
        char[][] board = new char[R][C];
        for (int i = 0; i < R; i++) {
            String row = sc.nextLine().trim();
            for (int j = 0; j < C; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        int targetR = sc.nextInt();
        int targetC = sc.nextInt();

        if (board[targetR][targetC] == '*') {
            System.out.println("Mine");
            return;
        }

        int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            { 0, -1},          { 0, 1},
            { 1, -1}, { 1, 0}, { 1, 1}
        };

        int count = 0;

        for (int[] d : directions) {
            int nr = targetR + d[0];
            int nc = targetC + d[1];

            if (nr >= 0 && nr < R && nc >= 0 && nc < C) {
                if (board[nr][nc] == '*') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
