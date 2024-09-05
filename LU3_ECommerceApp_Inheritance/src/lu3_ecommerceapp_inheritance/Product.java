
package lu3_ecommerceapp_inheritance;

//Abstract class representing a general product in the e-commerce app
abstract class Product {
    //common fields that all product sub-classes will inherit
    private String name;
    private double price;

    //constructor: Initialize product details
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    //concrete method: displayInfo() that is shared across all products to display basic info
    public void displayInfo()
    {
        System.out.println("Product: " + name + ", Price: R" + price);
    }
    
    //abstract method: Must be implemented by the subclasses. 
    //There is no method body provided by the parent class
    //there is no {} when using an abstract class as there is no implementation
    abstract void deliver();
    
    //getter method to access the product name
    public String getName() {
        return name;
    }
    
    //overriding of the toString() method from the built-in Object Class
    //we have access to the Object class through the default package (java.lang)
  //provide a meaningful string representation of a Product
    @Override
    public String toString()
    {
        return "Product: " + name + " - R" + price;
    }
    
    
    
    
    
}
