
public class Recursion {

    public static int firstocc = -1;
    public static int lastocc = -1;

    public static void FirstandLastOcc(int idx, String str, char element) {

        if (idx == str.length()) {
            System.out.println(firstocc);
            System.out.println(lastocc);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == element) {
            if (firstocc == -1) {
                firstocc = idx;

            } else {
                lastocc = idx;
            }
        }
        FirstandLastOcc(idx + 1, str, element);

    }

    public static void main(String[] args) {
        String str = "abaacaaadaafgdr";
        FirstandLastOcc(0, str, 'a');
    }
}
