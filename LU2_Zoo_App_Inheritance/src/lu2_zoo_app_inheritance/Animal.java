
package lu2_zoo_app_inheritance;

/**
 *This will be our Parent Class
 */
public class Animal {
    //generic fields that all of the child classes will inherit
    private String name; 
    private int age; 

    //Constructor to initialize name & age
    public Animal(String name, int age) {
        this.name = name; //this: is used to refer to the current object's field
        this.age = age;
    }
    
    //Method1: makeSound() >>>MethodOverridding will replace the behaviour  
    public void makeSound()
    {
        System.out.println("Some generic animal sounds.....");
    }
    
    //Method2: eat
    public void eat()
    {//Using the 'name'field of the current object
        System.out.println(name  + " is eating");
    }
    
    //Method3: Display info
    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    
    
    
}
