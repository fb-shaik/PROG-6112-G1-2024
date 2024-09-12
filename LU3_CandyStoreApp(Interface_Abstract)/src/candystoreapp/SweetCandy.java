package candystoreapp;

// Import the JOptionPane class from the javax.swing package for creating dialog boxes
import javax.swing.JOptionPane;

/**
 * SweetCandy class - a subclass of Candy
 * This class represents a specific type of candy that has a flavor attribute
 * It extends the Candy class, inheriting its basic properties and methods
 */
class SweetCandy extends Candy {
    // Instance variable specific to SweetCandy
    private String flavor; // Stores the flavor of the sweet candy

    /**
     * Constructor for SweetCandy
     * Initializes a new SweetCandy object with the given parameters
     * 
     * @param name     The name of the candy (inherited from Candy)
     * @param price    The price of the candy (inherited from Candy)
     * @param quantity The quantity of the candy in stock (inherited from Candy)
     * @param flavor   The flavor of the sweet candy (specific to SweetCandy)
     */
    public SweetCandy(String name, double price, int quantity, String flavor) {
        // Call the superclass (Candy) constructor to initialize inherited attributes
        super(name, price, quantity);
        // Initialize the flavor attribute specific to SweetCandy
        this.flavor = flavor;
    }

    /**
     * Getter method for the flavor attribute
     * 
     * @return The flavor of the sweet candy
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Override the displayCandyInfo method from the superclass (Candy)
     * This method displays information about the sweet candy using a dialog box
     * It includes all the information from the superclass plus the flavor
     */
    @Override
    public void displayCandyInfo() {
        // Construct a formatted string with all the candy information
        String message = "Sweet Candy Information:\n" +
                         "Name: " + getName() + "\n" +
                         "Price: R" + String.format("%.2f", getPrice()) + "\n" +
                         "Quantity: " + getQuantity() + "\n" +
                         "Flavor: " + getFlavor();
        
        // Display the message in a dialog box using JOptionPane
        // Parameters: (parent component, message, title, message type)
        JOptionPane.showMessageDialog(null, message, "Sweet Candy Info", JOptionPane.INFORMATION_MESSAGE);
    }
}