
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.println("enter the element of vector 1 ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the element of vector 2");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Math.pow(a[i] - b[i], 2);

        }
        double dis = Math.sqrt(sum);
        System.out.println("Euclidean distance" + " " + dis);
    }
}
