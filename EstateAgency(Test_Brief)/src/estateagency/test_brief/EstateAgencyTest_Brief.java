/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estateagency.test_brief;

import java.util.Scanner;

/**
 *
 * @author FS
 */
public class EstateAgencyTest_Brief {

public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take input for the estate agent name
        System.out.print("Enter the current estate agent name: ");
        String agentName = input.nextLine();

        // Take input for the property price
        System.out.print("Enter the property price: ");
        double propertyPrice = input.nextDouble();

        // Create an instance of EstateAgentSales using the input values
        EstateAgentSales agent = new EstateAgentSales(agentName, propertyPrice);

        // Display the property report based on the input
        System.out.println(); // Print a new line for clarity
        agent.printPropertyReport();

        // Close the scanner to prevent resource leaks
        input.close();
    }
}