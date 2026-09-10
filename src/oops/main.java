
public class main {

    public static void main(String[] args) {

        student a = new student(1, 16, "radha", 5);
        student b = new student(a);

        // a.name = "radha";
        // a.id = 1;
        // a.age = 14;
        // a.nos = 4;
        System.out.println(a.name);
        System.out.println(a.id);
        a.sleep();
        b.sleep();
        System.out.println(b.name);
        System.out.println(b.id);
        System.out.println(b.nos);
        b.bunk();
    }
}
