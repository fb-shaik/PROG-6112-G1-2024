
package lu3_interface_demo;

/*we want to use the abstract methods that is in the interface called iPayment
    To do this we need to use the keyword ' implement ' to bring across those methods

Syntax: public class ClassName implements interfaceClassName

*/
public class CryptoPayment implements iPayment 
{//We are now implementing the Payment interface for Crypto

    @Override
    public void processPayment(double amount)
    {//Logic to process payment via crypto
        System.out.println("Processing cryptocurrency payment of R " + amount);
    }

    @Override
    public String getPaymentStatus() 
    {//Logic to check payment status
        return "Cryptocurrency payment successful";
    }
    
}
