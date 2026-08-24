
import java.util.*;

public class twoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int a = sc.nextInt();
        System.out.println("enter number of columns");
        int b = sc.nextInt();
        System.out.println("enter the elements");
        int matrix[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
