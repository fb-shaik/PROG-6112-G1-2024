/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candystoreapp;

/**
 * Candy Abstract Class
 * This abstract class provides a base implementation for all types of candy in the application.
 * It implements the ICandy interface and defines common attributes and methods for all candies.
 *
 * @author FS
 */
abstract class Candy implements ICandy {
    // Protected instance variables accessible by subclasses
    protected String name;    // The name of the candy
    protected double price;   // The price of the candy
    protected int quantity;   // The quantity of the candy in stock

    /**
     * Constructor for Candy
     * Initializes a new Candy object with the given parameters
     *
     * @param name     The name of the candy
     * @param price    The price of the candy
     * @param quantity The quantity of the candy in stock
     */
    public Candy(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Getter method for the name attribute
     * 
     * @return The name of the candy
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for the price attribute
     * 
     * @return The price of the candy
     */
    public double getPrice() {
        return price;
    }

    /**
     * Getter method for the quantity attribute
     * 
     * @return The quantity of the candy in stock
     */
    public int getQuantity() {
        return quantity;
    }

    // The displayCandyInfo() method from ICandy is not implemented here,
    // making this class abstract. Subclasses must provide an implementation.
}