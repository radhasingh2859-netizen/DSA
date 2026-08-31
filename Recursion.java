
public class Recursion {

    public static int printfactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int a = printfactorial(n - 1);
        int b = n * (n - 1);
        return b;
    }

    public static void main(String[] args) {
        int n = 5;
        printfactorial(n);

        System.out.println(printfactorial(n));
    }

}
