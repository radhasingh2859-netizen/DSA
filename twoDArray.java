
import java.util.*;

public class twoDArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the matrix");
        int n = sc.nextInt();
        int m1[][] = new int[n][n];
        int m2[][] = new int[n][n];
        System.out.println("enter the elements of m1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = sc.nextInt();

            }
        }
        System.out.println("enter the element of m2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m2[i][j] = sc.nextInt();

            }

        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += m1[i][j] + m2[i][j];

                }

            }

        }

        System.out.println("sum of digonal matrix" + sum);
    }
}
