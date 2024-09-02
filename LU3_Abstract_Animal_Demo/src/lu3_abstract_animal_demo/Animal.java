
package lu3_abstract_animal_demo;

/*Animal class will be set to abstract
This means we cannot create objects directlty from this class
This will also behave as our parent / base class
 */
abstract class Animal {
    //common fields across all the child classes
    public String name;
    public int age;

    //Constructor for Animal 
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + " is created.");
    }
    
    //concrete method: A method that has a body / implementation, there is a set of {}
    public void eat()
    {//this is the implementation
        System.out.println(name + " is eating.");
    }
    
      //concrete method: A method that has a body / implementation, there is a set of {}
    public void sleep()
    {//this is the implementation
        System.out.println(name + " is sleeping.");
    }
    
    //abstract method: A method without any implementation
    abstract void sound(); //there is no {} because there is no implementation provided by the parent class
    abstract void habitat();//there is no {} because there is no implementation provided by the parent class
    
    
    
}
