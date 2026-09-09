
public class student {

    public int id;
    public int age;
    public String name;
    public int nos;

    public student(int id, int age, String name, int nos) {
        System.out.println("student parameterised constructor");
        this.id = id;
        this.age = age;
        this.nos = nos;
        this.name = name;

    }

    public student(student srcobj) {
        System.out.println("student copy constructor called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;

    }

    public void study() {
        System.out.println(name + " studying");
    }

    public void sleep() {
        System.out.println(name + " sleeping");
    }

    public void bunk() {
        System.out.println(name + " bunking");
    }

}
