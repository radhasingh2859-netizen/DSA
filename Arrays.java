
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size element");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int uni[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean dup = false;
            for (int j = 0; j < n; j++) {
                if (arr[j] == uni[j]) {
                    dup = true;
                }

            }
            if (!dup) {
                uni[count] = arr[i];
                count++;

            }
        }
        System.out.println("array without duplicate number");
        for (int i = 0; i <= count; i++) {
            System.out.print(uni[i] + " ");
        }

    }
}
