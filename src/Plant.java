abstract public class Plant implements PlantInterface { // we are never going to create any object just con and Method
    private final String name;
    private final double length;

 //Constructor
    public Plant(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length; //going to use it Sub class
    }
    abstract public String wateringInstructions();
}
