
public class Recursion {

    public static boolean mapping[] = new boolean[26];

    public static void removedup(int idx, String str, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if (mapping[currchar - 'a']) {
            removedup(idx + 1, str, newString);
        } else {
            newString += currchar;

            mapping[currchar - 'a'] = true;
            removedup(idx + 1, str, newString);
        }
    }

    public static void main(String[] args) {
        String str = "aafhhhdxssky";
        removedup(0, str, "");
    }

}
