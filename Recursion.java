
public class Recursion {

    public static int printx(int x, int n) {
        if (x == 0) {
            return 0;

        }
        if (n == 0) {
            return 1;

        }
        int a = printx(x, n - 1);
        int b = x * a;
        return b;

    }

    public static void main(String args[]) {
        int n = 3;
        int x = 2;
        System.out.println(printx(x, n));
    }

}
