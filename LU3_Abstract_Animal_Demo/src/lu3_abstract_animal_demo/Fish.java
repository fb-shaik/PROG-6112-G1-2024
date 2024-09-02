
package lu3_abstract_animal_demo;

public class Fish extends Animal{
    
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() 
    {//we add in implementation of the abstract class here
        System.out.println(name + " goes blob, blob, blob");
    }

    @Override
    void habitat()
    {//we add in implementation of the abstract class here
        System.out.println(name + " lives in water.");
    }
    
    public void swim()//this method is exclusive to Fish objects only 
    {
        System.out.println(name + " is swimming! ");
    }
    
}
