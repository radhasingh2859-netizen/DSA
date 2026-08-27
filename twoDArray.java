
import java.util.*;

public class twoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows of the spiral matrix");
        int n = sc.nextInt();
        System.out.println("enter the columns of the spiral matrix");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        System.out.println("enter the elements of the matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();

            }

        }
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        System.out.println("spiral order");
        while (top <= bottom && left <= right) {

            // Top row
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
}
