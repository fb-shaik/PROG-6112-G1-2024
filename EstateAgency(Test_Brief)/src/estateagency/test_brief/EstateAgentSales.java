/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estateagency.test_brief;

/**
 *
 * @author FS
 */

// Step 3: Create a class EstateAgentSales that extends Staff and implements iEstateAgent
class EstateAgentSales extends Staff implements iEstateAgent {
    double propertyPrice;  // Property price for which commission is calculated
    double agentCommission; // Calculated commission based on the property price

    // Constructor for EstateAgentSales to initialize name and property price
    public EstateAgentSales(String name, double propertyPrice) {
        super(name);  // Call the constructor of the superclass (Staff)
        this.propertyPrice = propertyPrice;
        this.agentCommission = calculateCommission(); // Calculate the commission
    }
    
    // Method to calculate the commission, which is 20% of the property price
    private double calculateCommission() {
        return propertyPrice * 0.20;
    }
    
    // Override the displayInfo method to provide specific implementation
    @Override
    void displayInfo() {
        System.out.println("ESTATE AGENT NAME: " + name);
    }
    
    // Implement the printPropertyReport method from the iEstateAgent interface
    @Override
    public void printPropertyReport() {
        System.out.println("ESTATE AGENT REPORT");
        System.out.println("*******************");
        displayInfo();  // Call the overridden displayInfo method
        System.out.printf("PROPERTY PRICE: R %.1f\n", propertyPrice);
        System.out.printf("AGENT COMMISSION: R %.1f\n", agentCommission);
    }
}