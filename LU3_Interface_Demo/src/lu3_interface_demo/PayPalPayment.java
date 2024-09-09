
package lu3_interface_demo;

/*we want to use the abstract methods that is in the interface called iPayment
    To do this we need to use the keyword ' implement ' to bring across those methods

Syntax: public class ClassName implements interfaceClassName

*/
public class PayPalPayment implements iPayment 
{//We are now implementing the Payment interface for PayPal

    @Override
    public void processPayment(double amount)
    {//Logic to process payment via paypal
        System.out.println("Processing PayPal payment of R " + amount);
    }

    @Override
    public String getPaymentStatus() 
    {//Logic to check payment status
        return "PayPal payment successful";
    }
    
}
