public class Palm extends Plant {
//This is example of inheritance because Palm is sub class of Plant
    //Variables for creating the instruction message
    public static final String action = "Give ";
    public static final String amountMessage = " liters of tap water.";
    public static final double litres_per_meter = 0.5;

    public Palm(String name, int length) {
        super(name, length);
    }

    @Override
    public String wateringInstructions() {
        return action + getName() + " " + litres_per_meter * getLength() + amountMessage;
    }
}
