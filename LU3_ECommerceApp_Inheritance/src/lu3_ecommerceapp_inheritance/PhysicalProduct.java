
package lu3_ecommerceapp_inheritance;

//Subclass PhysicalProduct extends the inherited behaviour of the base Product class
//It can also have its own exclusive fields & methods

//Represent a tangible item
public class PhysicalProduct extends Product{
    
    //PhysicalProduct currently does not have any exclusive fields
    
//Constructor that calls the parent class (Product) constructor
    public PhysicalProduct(String name, double price) {
        super(name, price);
    }
    
    //Abstract method becomes a concrete method in the child class
    //This is because the child class now has to provide a method body/implementation
    //Implementation for delivery of a physical product
    @Override
    void deliver() 
    {
        System.out.println("Shipping the physical product: " + getName());
    }
    
}
