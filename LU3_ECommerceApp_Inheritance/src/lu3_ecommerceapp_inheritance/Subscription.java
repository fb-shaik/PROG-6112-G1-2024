
package lu3_ecommerceapp_inheritance;

//Subclass representing a subscription service, such as a streaming service
public class Subscription  extends Product
{

    //Constructor that class the parent class (Product) constructor
    public Subscription(String name, double price) {
        super(name, price);
    }

    
    //Implementing the abstract deliver method for subscription products
    @Override
    void deliver() 
    {
        System.out.println("Activating subscription for: " + getName());
    }
    
}
