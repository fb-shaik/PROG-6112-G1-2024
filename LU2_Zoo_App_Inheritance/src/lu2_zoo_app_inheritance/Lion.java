/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lu2_zoo_app_inheritance;

/**
 *This is a child class of the Animal Class
 * it will 'inherit' all the fields & methods 
 * that are part  of the Parent Animal class
 * This class will also have its own exclusive fields & methods
 */
public class Lion extends Animal
{
    String colour; //exclusive field to the Lion Class only

    public Lion(String name, int age, String colour) {
        /*Keyword Super: 
        Used in the constructor to call the 
        constructor from the Parent class
        The reason for this is beacuse the child class object is built off
        the Parent class before having its own fields & behaviours 
        add to it functionality
        */
        super(name, age);//this brings the name & age fields to Lion
        this.colour = colour; //this field is exclusive to Lion only
    }
    
    //Overridding the makeSound() method from the Animal Parent Class
    @Override
    public void makeSound()
    {
        System.out.println("Roar!"); //specific behaviour to the Lion class
    }
    
    //Method specific to the Lion (its own behaviour)
    public void hunt()
    {
        System.out.println("The lion is hunting");
    }
    

    
    }
    
    

