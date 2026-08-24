
import java.util.*;

public class twoDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int a = sc.nextInt();

        System.out.println("Enter number of columns");
        int b = sc.nextInt();

        int matrix1[][] = new int[a][b];
        int matrix2[][] = new int[a][b];
        int sum[][] = new int[a][b];

        // Matrix 1
        System.out.println("Enter elements of matrix 1");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Matrix 2
        System.out.println("Enter elements of matrix 2");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Sum
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print sum
        System.out.println("Sum of matrices:");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
