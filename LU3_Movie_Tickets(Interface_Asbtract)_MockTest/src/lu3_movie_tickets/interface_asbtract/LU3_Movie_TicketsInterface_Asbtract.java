/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lu3_movie_tickets.interface_asbtract;

// Main class to demonstrate the ticket system

import java.util.Scanner;

public class LU3_Movie_TicketsInterface_Asbtract {

    public static void main(String[] args) {
      // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Movie Ticket System!");

        // Prompt for and read customer name
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        // Prompt for and read movie title
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();

        // Prompt for and read customer age with input validation
        int age;
        while (true) {
            System.out.print("Enter customer age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age > 0) break; // Valid age entered, exit loop
                System.out.println("Age must be a positive number.");
            } else {
                System.out.println("Please enter a valid integer for age.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Prompt for and read movie price with input validation
        double price;
        while (true) {
            System.out.print("Enter movie price: R");
            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                if (price > 0) break; // Valid price entered, exit loop
                System.out.println("Price must be a positive number.");
            } else {
                System.out.println("Please enter a valid number for price.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Create a TicketSales object with the user-provided information
        TicketSales ticket = new TicketSales(name, title, age, price);
        
        // Print the ticket details
        ticket.print_tickets();

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}