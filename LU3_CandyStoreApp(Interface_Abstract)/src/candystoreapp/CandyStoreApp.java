package candystoreapp;

import javax.swing.JOptionPane;

// Subclass implementation for Sweet Candy
class SweetCandy extends Candy {
    // Additional attribute specific to SweetCandy
    private String flavor;

    /**
     * Constructor for SweetCandy
     * @param name The name of the candy
     * @param price The price of the candy
     * @param quantity The quantity of the candy in stock
     * @param flavor The flavor of the sweet candy
     */
    public SweetCandy(String name, double price, int quantity, String flavor) {
        // Call the superclass (Candy) constructor
        super(name, price, quantity);
        // Initialize the flavor attribute
        this.flavor = flavor;
    }

    /**
     * Getter method for the flavor attribute
     * @return The flavor of the sweet candy
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Override the displayCandyInfo method from the superclass
     * This method displays information about the sweet candy using a dialog box
     */
    @Override
    public void displayCandyInfo() {
        // Construct the message string with candy information
        String message = "Sweet Candy Information:\n" +
                         "Name: " + getName() + "\n" +
                         "Price: R" + String.format("%.2f", getPrice()) + "\n" +
                         "Quantity: " + getQuantity() + "\n" +
                         "Flavor: " + getFlavor();
        
        // Display the message in a dialog box
        JOptionPane.showMessageDialog(null, message, "Sweet Candy Info", JOptionPane.INFORMATION_MESSAGE);
    }
}