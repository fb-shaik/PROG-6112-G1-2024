
package lu3_interface_demo;

/*Syntax: public interface iClassName {} 

- When declaring an interface, often we use letter (i) to prefeace the interface name
- Make use of the keyword ' implement ' when calling the interface in our app
- Interfaces are a reference type in Java, this means it behaviours like a class but it is used 
to specify what methods a class should implement
- Type of methods that an interface can have:
    - asbtract methods (just method signatures)
    - default methods
    - static methods
    - constants (fixed data that will never change during the use of an application)
    - concrete methods
- Interface implicitly known to be public & abstract

*/

//define an interface for Payment behaviour (3 types: Credit card, Paypal, Crypto)
//This interface will outline the necessary methods each payment type must implement
public interface iPayment {
    
    //abstract methods (implicitly public & abstract)
    void processPayment(double amount);
    
    String getPaymentStatus(); 
    
}
