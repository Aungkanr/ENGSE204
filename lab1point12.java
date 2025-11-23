import java.util.Scanner;
public class lab1point12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" enter value = ");
        int sum = input.nextInt();

        int[] num = new int[sum];   
         for (int S = 0 ; S < sum ; S++) {
            num [S] = input.nextInt();

        } // ทั้งหมดคือลูปเพื่อที่จะกรอกค่า        
        int array = sumArray(num);
        // นำเข้า num ต้องใส่ num
        System.out.println(" ans = " +array);

        input.close();
    }
    
}
