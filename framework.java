
import java.util.*;

public class framework {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);

        System.out.println(set);

        System.out.println(set.contains(20));

        set.remove(20);

        System.out.println(set);
    }
}
