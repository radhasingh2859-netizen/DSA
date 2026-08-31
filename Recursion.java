
public class Recursion {

    public static void TowerOfHanoi(int n, String source, String helper, String des) {
        if (n == 1) {
            System.out.println("transfer disk" + n + "from" + source + "to" + des);
            return;

        }
        TowerOfHanoi(n - 1, source, des, helper);
        System.out.println("transfer disk" + n + "from" + source + "to " + des);
        TowerOfHanoi(n - 1, helper, source, des);
    }

    public static void main(String[] args) {
        int n = 3;
        TowerOfHanoi(n, "s", "h", "d");
    }

}
