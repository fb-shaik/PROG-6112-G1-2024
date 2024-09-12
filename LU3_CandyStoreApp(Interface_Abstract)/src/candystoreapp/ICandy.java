/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candystoreapp;

/**
 * ICandy Interface
 * This interface defines the contract for candy objects in the candy store application.
 * Any class that implements this interface must provide an implementation for the displayCandyInfo method.
 *
 * @author FS
 */
interface ICandy {
    /**
     * Displays information about the candy.
     * This method is intended to be implemented by concrete candy classes to show
     * relevant details about a specific type of candy, such as its name, price, quantity, etc.
     * The exact implementation and the information displayed may vary depending on the type of candy.
     */
    void displayCandyInfo();
}