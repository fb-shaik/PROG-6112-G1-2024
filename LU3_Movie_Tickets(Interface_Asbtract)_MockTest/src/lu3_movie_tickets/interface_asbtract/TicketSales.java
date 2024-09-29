/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lu3_movie_tickets.interface_asbtract;

/**
 *
 * @author FS
 */
// Concrete class representing a ticket sale
class TicketSales extends Tickets {
    // Constructor calling the superclass constructor
    public TicketSales(String customerName, String movieTitle, int customerAge, double moviePrice) {
        super(customerName, movieTitle, customerAge, moviePrice);
    }

    // Implementation of the print_tickets method from the iTickets interface
    @Override
    public void print_tickets() {
        // Calculate discount based on customer age
        double discount = (getCustomerAge() >= 65) ? 0.1 : 0; // 10% discount for 65 and older
        double finalCost = getMoviePrice() * (1 - discount); // Apply discount to movie price

        // Print ticket details
        System.out.println("---------------------------------------");
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Movie Title: " + getMovieTitle());
        System.out.printf("Price: R%.2f\n", getMoviePrice());
        System.out.printf("Discount: %.0f%%\n", discount * 100); // Display discount as percentage
        System.out.printf("Final Cost: R%.2f\n", finalCost);
        System.out.println("---------------------------------------");
    }
}