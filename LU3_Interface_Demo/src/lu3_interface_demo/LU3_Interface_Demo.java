
package lu3_interface_demo;

//App will explore the use of interfaces
public class LU3_Interface_Demo {
    
    
    public static void main(String[] args) {
        //Using the interface to process different payment types
    
    //create an object from each class (PayPal, CreditCard, Crypto)
    //interfaceClassName objectName = new ClassNameConstructor();
    iPayment creditCardPayment = new CreditCardPayment();
    creditCardPayment.processPayment(100.00);
        System.out.println(creditCardPayment.getPaymentStatus());
        
        System.out.println();
        
        iPayment payPalPayment = new PayPalPayment();
        payPalPayment.processPayment(500.00);
        System.out.println(payPalPayment.getPaymentStatus());
        
        System.out.println();
        iPayment cryptoPayment = new CryptoPayment();
        cryptoPayment.processPayment(8000.00);
        System.out.println(cryptoPayment.getPaymentStatus());
        
    
    }
    
}
