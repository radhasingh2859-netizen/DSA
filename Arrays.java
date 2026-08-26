
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the element");
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");

        }
    }
}
