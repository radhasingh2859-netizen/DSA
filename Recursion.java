
public class Recursion {

    public static void printxinend(String str, int idx, int count, String newsString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newsString += 'x';

            }
            System.out.println(newsString);

            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            printxinend(str, idx + 1, count, newsString);
        } else {
            newsString += currChar;
            printxinend(str, idx + 1, count, newsString);
        }

    }

    public static void main(String[] args) {
        String str = "abxxxdxxxghi";
        printxinend(str, 0, 0, "");
    }

}
