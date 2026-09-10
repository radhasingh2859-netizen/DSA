
public class student {

    private int id;
    private int age;
    private String name;
    private int nos;
    private long mobilenumber;

    public student(int id, int age, String name, int nos, long mobilenumber) {
        System.out.println("student parameterised constructor");
        this.id = id;
        this.age = age;
        this.nos = nos;
        this.name = name;
        this.mobilenumber = mobilenumber;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int c) {
        if (age < 100) {
            return;
        }
        this.age = c;
    }

    public int getAge() {
        return this.age;
    }

}

// public student(student srcobj) {
//     System.out.println("student copy constructor called");
//     this.id = srcobj.id;
//     this.age = srcobj.age;
//     this.name = srcobj.name;
//     this.nos = srcobj.nos;
//  }
// public void study() {
//     System.out.println(name + " studying");
// }
// public void sleep() {
//     System.out.println(name + " sleeping");
// }
// public void bunk() {
//     System.out.println(name + " bunking");
// }
// private void chatting() {
//     System.out.println(name + "chatting");
    // }
