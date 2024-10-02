public class Cactus extends Plant {
    public static final String action = "Give ";
    public static final String amountMessage = " 2 cl of mineral water";

    public Cactus(String name, double length) {
        super(name, length);
    }

    @Override
    public String wateringInstructions() {
        return action + getName() + amountMessage;
    }
}
