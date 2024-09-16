/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candystoreapp;

// Import the JOptionPane class from the javax.swing package for creating dialog boxes
import javax.swing.JOptionPane;

/**
 * ChocolateCandy class - a subclass of Candy
 * This class represents a specific type of candy that has a chocolate type attribute
 * It extends the Candy class, inheriting its basic properties and methods
 *
 * @author FS
 */
class ChocolateCandy extends Candy {
    // Instance variable specific to ChocolateCandy
    private String chocolateType; // Stores the type of chocolate (e.g., dark, milk, white)

    /**
     * Constructor for ChocolateCandy
     * Initializes a new ChocolateCandy object with the given parameters
     * 
     * @param name          The name of the candy (inherited from Candy)
     * @param price         The price of the candy (inherited from Candy)
     * @param quantity      The quantity of the candy in stock (inherited from Candy)
     * @param chocolateType The type of chocolate (specific to ChocolateCandy)
     */
    public ChocolateCandy(String name, double price, int quantity, String chocolateType) {
        // Call the superclass (Candy) constructor to initialize inherited attributes
        super(name, price, quantity);
        // Initialize the chocolateType attribute specific to ChocolateCandy
        this.chocolateType = chocolateType;
    }

    /**
     * Getter method for the chocolateType attribute
     * 
     * @return The type of chocolate used in the candy
     */
    public String getChocolateType() {
        return chocolateType;
    }

    /**
     * Override the displayCandyInfo method from the superclass (Candy)
     * This method displays information about the chocolate candy using a dialog box
     * It includes all the information from the superclass plus the chocolate type
     */
    @Override
    public void displayCandyInfo() {
        // Construct a formatted string with all the candy information
        String message = "Chocolate Candy Information:\n" +
                         "Name: " + getName() + "\n" +
                         "Price: R" + String.format("%.2f", getPrice()) + "\n" +
                         "Quantity: " + getQuantity() + "\n" +
                         "Chocolate Type: " + getChocolateType();
        
        // Display the message in a dialog box using JOptionPane
        // Parameters: (parent component, message, title, message type)
        JOptionPane.showMessageDialog(null, message, "Chocolate Candy Info", JOptionPane.INFORMATION_MESSAGE);
    }
}