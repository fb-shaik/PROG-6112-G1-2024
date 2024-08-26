/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lu2_zoo_app_inheritance;


public class Elephant extends Animal {
    
    String type;
    
    public Elephant(String name, int age, String type) {
        super(name, age); //Calls the constructor from Animal class
        this.type = type;
    }
    
    public void makeSound()
    {
        System.out.println("Trumpet!"); //specific sound for an Elephant
    }
    
    //Method exclusive to Elephant
    public void bath()
    {
        System.out.println("The elephant is taking a bath");
    }
    
    
    
}
