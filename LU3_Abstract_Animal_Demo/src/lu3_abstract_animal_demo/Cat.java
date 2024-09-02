
package lu3_abstract_animal_demo;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() 
    {//we add in implementation of the abstract class here 
        System.out.println(name + " meows.");
    }

    @Override
    void habitat() 
    {//we add in implementation of the abstract class here 
        System.out.println(name + " lives in house or garden");
    }
    
    public void scratch()//this method is exclusive to Cat objects only 
    {
        System.out.println(name + " loves to scratch people!");
    }
}
