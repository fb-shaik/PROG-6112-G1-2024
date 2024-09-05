
package lu3_ecommerceapp_inheritance;

//Subclass representing a digital product such as an e-book / software
public class DigitalProduct extends Product 
{

    //Constructor that class the parent class (Product) constructor
    public DigitalProduct(String name, double price) 
    {
        super(name, price);
    }

    
    //Implementing the abstract deliver method for digital products
    @Override
    void deliver() 
    {
        System.out.println("Download link to be emailed for " + getName());
    }
    



}
