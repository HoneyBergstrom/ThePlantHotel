public class Carnivous extends Plant {
    public static final String action = "Give ";
    public static final double basic_level = 0.1;
    public static final double litres_per_meter = 0.2;
    public static final String amountMessage = " liters protein drink.";

    public Carnivous(String name, double length) {
        super(name, length);
    }

    @Override
    public String wateringInstructions() {
        double amount = basic_level + (litres_per_meter * getLength());
        return action + getName() + " " + amount + amountMessage;
    }
}
