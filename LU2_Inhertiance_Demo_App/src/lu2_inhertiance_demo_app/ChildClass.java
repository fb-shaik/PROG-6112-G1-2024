/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lu2_inhertiance_demo_app;

/*
 *This is a child class. It will inherit from the parent class
    What will it inherit: Fields & methods that are part of the parent class
    
    Syntax for inheritance:
        class ChildClassName extends ParentClassName{}
        class SubClassName extends SuperClassName{}

 */
public class ChildClass extends ParentClass {
    
    //currently empty of its own fields & methods
    //using inheritance we are able to access the above ParentClass fields
    //this is done via an object created for this class (ChildClas) & dot operator
    //So far all fields & methods have been inherited from the ParentClass
    
    //lets add exclusivity to this class: Stuff that will belong only to this class
    
    //exclusive fields to ChildClass
    String schoolName;
    String grade; 
    
    //exclusive method to ChildClass
    public void displayChildClassInfo()
    {
        System.out.println("School Name: " + schoolName);
        System.out.println("Grade: " + grade);
    }

}
