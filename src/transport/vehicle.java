package transport;

public class vehicle {

    public String name;
    public String model;
    public int noOfTyres;

    vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;

    }

    void startEngine() {
        System.out.println("engine is starting of" + " " + name + " " + model);

    }

    void stopEngine() {
        System.out.println("engine is stopping of" + " " + name + " " + model);
    }

}
