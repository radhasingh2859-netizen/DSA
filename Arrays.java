
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
            }

        }
        if (sorted) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }

    }

}
