
package lu3_abstract_animal_demo;

//Inheritance Syntax: class ChildClassName extends ParentClassName
public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void sound()//we add in implementation of the abstract class here 
    {
        System.out.println(name + " barks.");
    }

    @Override
    void habitat() //we add in implementation of the abstract class here 
    {
        System.out.println(name + " lives in a house or yard");
    }
    
    public void tricks() //this method is exclusive to Dog objects only 
    {
        System.out.println(name + " can do tricks!");
    }
    
}
