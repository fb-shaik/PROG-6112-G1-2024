/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lu2_zoo_app_inheritance;

public class Giraffe extends Animal {
    
    //Constructor for the Giraffe class uses 'super' to call the parent class constructor
    public Giraffe(String name, int age) {
        super(name, age);
    }
    
    //Overriding the makeSound() from the Animal Class
    public void makeSound()
    {
        System.out.println("Hum!"); //specific sound for Giraffe class 
    }
    
    //Method exclusive to Giraffe class
    public void graze()
    {
        System.out.println("The giraffe is grazing.");
    }
    
    
}
