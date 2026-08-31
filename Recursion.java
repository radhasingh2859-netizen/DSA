
public class Recursion {

    public static int printpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;

        }
        if (n % 2 == 0) {
            return printpower(x, n / 2) * printpower(x, n / 2);
        } else {
            return x * printpower(x, n / 2) * printpower(x, n / 2);

        }
    }

    public static void main(String[] args) {
        int x = 2, n = 3;
        System.out.println(printpower(x, n));
    }
}
