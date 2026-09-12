package transport;

public class motorcycle extends vehicle {

    public String handleBarStyle;
    public String SuspensionType;

    public motorcycle(String handleBarStyle, String SuspensionType, String name, String model, int noOfTyres) {
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.SuspensionType = SuspensionType;
    }

    public void wheelie() {
        System.out.println("motorcycle is doing wheelie" + " " + name);
    }

}
