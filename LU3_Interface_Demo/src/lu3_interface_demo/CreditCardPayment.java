package lu3_interface_demo;

/*we want to use the abstract methods that is in the interface called iPayment
    To do this we need to use the keyword ' implement ' to bring across those methods

Syntax: public class ClassName implements interfaceClassName

*/
public class CreditCardPayment implements iPayment
{//We are now implementing the Payment interface for CreditCard

    @Override
    public void processPayment(double amount) 
    {//Logic to process payment via a credit card
        System.out.println("Processing credit card payment for R " + amount);
    }

    @Override
    public String getPaymentStatus()
    {//Logic to check payment status
        return "Credit Card payment successful";
    }
    
}
