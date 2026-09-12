package transport;

public class main {

    public static void main(String[] args) {
        car c = new car("maruti", "800", 4, 4, "auto");
        c.startEngine();
        c.startAC();
        c.stopEngine();
        motorcycle n = new motorcycle("u", "soft", "splendon", "xline", 2);
        n.startEngine();
        n.wheelie();
        n.stopEngine();

    }
}
