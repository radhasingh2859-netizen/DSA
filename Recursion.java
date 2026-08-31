
public class Recursion {

    public static void printnaturalnum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printnaturalnum(i + 1, n, sum);

    }

    public static void main(String[] args) {
        printnaturalnum(1, 10, 0);
    }

}
