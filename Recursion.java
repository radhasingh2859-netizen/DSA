
public class Recursion {

    public static void printAllSub(int idx, String str, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(idx);
        printAllSub(idx + 1, str, combination + currchar);//wants to come
        printAllSub(idx + 1, str, combination);//donot want to come

    }

    public static void main(String[] args) {
        String str = "abcd";
        printAllSub(0, str, "");
    }
}
