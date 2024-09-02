
package lu3_abstract_animal_demo;


public class LU3_Abstract_Animal_Demo {

  //test out our inheritance (Dog, Cat, Fish)
    public static void main(String[] args) {
        //dog object
        //ClassName objectName = new ClassName();
        Dog myDog = new Dog("Buddy", 5); //this the normal construction 
        
        /*ParentClassName objectName = new ChildClassName();
        Here, myCat and myFish are declared as type Animal, 
        even though they are instantiated as Cat and Fish respectively. 
        This is an example of polymorphism.
        
        When you declare an object as the parent type (Animal) but instantiate it as a 
        child type (Cat or Fish), you can only access methods that are defined in the 
        parent class or overridden in the child class.
        */
        Animal myCat = new Cat("Whiskers", 3);
        Animal myFish = new Fish("Goldie", 1); 
        
        /* Cannot create a Animal object because the Anumal ckass has been set to abstract
        Not Allowed: Animal myAnimal = new Animal("Jerry", 7);
        */
        
        
    System.out.println();
    myDog.sound(); // abstract method, takes implementation from child
    myDog.habitat(); // abstract method, takes implementation from child
    myDog.eat();//common concrete method
    myDog.sleep();//common concrete method
    myDog.tricks(); //exclusive to Dog object only
        
    System.out.println();
    myCat.sound();// abstract method, takes implementation from child
    myCat.habitat();// abstract method, takes implementation from child
    myCat.eat();//common concrete method
    myCat.sleep();//common concrete method
    
    
    System.out.println();
    myFish.sound();//abstract method, takes implementation from child
    myFish.habitat();//abstract method, takes implementation from child
    myFish.eat();//common concrete method
    myFish.sleep();//common concrete method
    
    
    
    /*
    The exclusive methods scratch() for Cat and swim() for Fish are not called 
    in the main method because of how the objects are declared & due to polymorphism
    The exclusive methods scratch() for Cat and swim() for Fish are not visible 
    because the compiler only sees these objects as Animal type.
    
    If you want to call the exclusive methods, you need to either:
    a) Declare the objects as their specific types
    Cat myCat = new Cat("Whiskers", 3);
    Fish myFish = new Fish("Goldie", 1);
    
    b) Or, cast the objects to their specific types when calling the exclusive methods:
    ((Cat)myCat).scratch();
    ((Fish)myFish).swim();
    */
    
    ((Cat)myCat).scratch();
    ((Fish)myFish).swim();
    
    }
    
}
