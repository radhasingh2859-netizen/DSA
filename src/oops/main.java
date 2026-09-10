
public class main {

    public static void main(String[] args) {

        student a = new student(1, 10, "radha", 5, 324596334);
        // student b = new student(a);

        // a.name = "radha";
        // a.id = 1;
        // a.age = 14;
        // a.nos = 4;
        // System.out.println(a.name);
        // System.out.println(a.id);
        // a.sleep();
        // b.sleep();
        // System.out.println(b.name);
        // System.out.println(b.id);
        // System.out.println(b.nos);
        // b.bunk();
        // System.out.println(a.mobilenumber);
        // a.chatting();
        System.out.println(a.getName());
        a.setAge(102);
        System.out.println(a.getAge());
    }
}
