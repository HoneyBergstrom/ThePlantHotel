import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Plant> plants = new ArrayList<>();

    public static void main(String[] args) {
        // Add plants to the list object
        plants.add(new Palm("Laura", 5));
        plants.add(new Palm("Olof", 1));
        plants.add(new Carnivous("Meatloaf", 0.7));
        plants.add(new Cactus("Igge", 0.2));

        String firstMessage = "What plant would you like to water?";
        StringBuilder stringBuilder = new StringBuilder(firstMessage);

        //Go through the entire arraylist plants and get the name of each plant and add them together with StringBuilder
        for (Plant plant : plants) {
            stringBuilder.append("\n").append(plant.getName()); // Append each name on a new line
        }
        String welcomeMessage = stringBuilder.toString(); //

        // Looping the user for a plant name until correct input or cancel
        while (true) {
            String userInput = JOptionPane.showInputDialog(welcomeMessage);
            // Check if the input is not null (user didn't press cancel)
            if (userInput != null) {
                // Check if the input is in the list of plants
                for (Plant plant : plants) {
                    if (plant.getName().equals(userInput)) {
                        //Polymorfism here because same Method but different behaviour depending on class
                        //It is also using the interface when calling wateringInstructions
                        JOptionPane.showMessageDialog(null, plant.wateringInstructions());
                        break;
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "You didn't choose a plant.");
                break; // Exit the loop if the user pressed Cancel
            }
        }
    }
}