package transport;

public class car extends vehicle {

    public int noOfDoors;
    public String transmissionType;

    public car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;

    }

    public void startAC() {
        System.out.println("ac started of" + " " + name);
    }
}
