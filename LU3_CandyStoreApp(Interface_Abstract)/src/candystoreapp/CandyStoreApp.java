package candystoreapp;

import javax.swing.JOptionPane;

/**
 * Main Application: CandyStoreApp
 * Purpose: Manage the candy store inventory by allowing users to add and display candy information.
 * This class demonstrates the use of polymorphism with the Candy subclasses.
 */
public class CandyStoreApp {

    public static void main(String[] args) {
        while (true) {
            // Present options to the user
            String[] options = {"Sweet Candy", "Chocolate Candy", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose a candy type to add:", "Candy Store",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            // Exit the program if the user chooses "Exit" or closes the dialog
            if (choice == 2 || choice == JOptionPane.CLOSED_OPTION) {
                break;
            }

            // Collect common information for all candy types
            String name = JOptionPane.showInputDialog("Enter candy name:");
            double price = Double.parseDouble(JOptionPane.showInputDialog("Enter candy price:"));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter candy quantity:"));

            Candy candy;
            // Create the appropriate candy object based on user choice
            if (choice == 0) {
                // Sweet Candy
                String flavor = JOptionPane.showInputDialog("Enter candy flavor:");
                candy = new SweetCandy(name, price, quantity, flavor);
            } else {
                // Chocolate Candy
                String chocolateType = JOptionPane.showInputDialog("Enter chocolate type:");
                candy = new ChocolateCandy(name, price, quantity, chocolateType);
            }

            // Display candy information using polymorphism
            candy.displayCandyInfo();

            // Ask if the user wants to add another candy
            int continueChoice = JOptionPane.showConfirmDialog(null, "Do you want to add another candy?",
                    "Continue?", JOptionPane.YES_NO_OPTION);
            if (continueChoice != JOptionPane.YES_OPTION) {
                break;
            }
        }

        // Display exit message
        JOptionPane.showMessageDialog(null, "Thank you for using the Candy Store Management System!");
    }
}