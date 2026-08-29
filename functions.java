
import java.util.*;

public class functions {

    public static boolean printeven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("even numbers are");
        for (int i = 0; i < n; i++) {
            if (printeven(arr[i])) {
                System.out.print(arr[i] + " ");
            }

        }

    }

}
