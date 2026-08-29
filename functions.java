
import java.util.*;

public class functions {

    // Function to calculate factorial
    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Function to calculate nCr
    static int nCr(int n, int r) {

        int result = factorial(n)
                / (factorial(r) * factorial(n - r));

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        System.out.println("nCr = " + nCr(n, r));
    }
}
