
package lu3_ecommerceapp_inheritance;

//Main class to demonstrate all the features (abstract class, dynamic binding, array of subclasses)
public class LU3_ECommerceApp_Inheritance {

    public static void main(String[] args) {
       
        //An array of Product objects to hold the different types of products
        Product [] products = new Product[3];
        
        //Because Product Class is abstract, we cannot direclty create Product object
        //We use the child classess to add in the various product types
        //We have created an Array of Subclass objects (allows for the object to be uniformly processed)
        products[0] = new PhysicalProduct("Laptop", 1700);
        products[1] = new DigitalProduct("E-Book", 150);
        products[2] = new Subscription("Amazon Prime", 95);
    
        //cannot directly create/add a Parent class object because the behaviour of the class is abstrct
        //products[3] = new Product("Name", 100); //>>>>>NOT ALLOWED!!!!!
    
        //dynamic binding: using the abstract method implementation from the sub-classess
        //When deliver() is called on a Product reference, 
        //java determines which subclass method implementation to execute at runtime
        
        //iterate through the array of subclass objects & use dynamic binding to call the correct method
        for(Product product : products)
        {//calls the concrete method from the Product class
            product.displayInfo();
        
            //calls the overridden method from each child class at runtime 
            product.deliver();
            
            //calls the overridden toString() method
            System.out.println(product.toString());
        }
        
        
        
    }
    
}
