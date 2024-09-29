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
// Step 2: Create an abstract class Staff with a constructor, variables, and a method
abstract class Staff {
    String name;

    // Constructor for Staff class to initialize the name
    public Staff(String name) {
        this.name = name;
    }
    
    // Abstract method to display information, to be overridden by subclasses
    abstract void displayInfo();
}