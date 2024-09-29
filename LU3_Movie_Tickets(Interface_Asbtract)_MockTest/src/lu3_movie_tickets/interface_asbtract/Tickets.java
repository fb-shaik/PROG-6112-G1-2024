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
// Abstract base class for all types of tickets
abstract class Tickets implements iTickets {
    // Private fields to store ticket information
    private String customerName;
    private String movieTitle;
    private int customerAge;
    private double moviePrice;

    // Constructor to initialize ticket information
    public Tickets(String customerName, String movieTitle, int customerAge, double moviePrice) {
        this.customerName = customerName;
        this.movieTitle = movieTitle;
        this.customerAge = customerAge;
        this.moviePrice = moviePrice;
    }

    // Getter methods to access private fields
    public String getCustomerName() { return customerName; }
    public String getMovieTitle() { return movieTitle; }
    public int getCustomerAge() { return customerAge; }
    public double getMoviePrice() { return moviePrice; }
}