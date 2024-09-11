
package lu3_notificationapp_iterface;

/**
 *This is the interface
 * Will act as a template for the other classes that implement it abstract method
 * Syntax: public interface InterfaceName {} 
 */
public interface INotificationType 
{
    //asbtract method: A method without any defined implementation
    void sendNotification();
    
    //this method will obtain its implementation via the classes that implement the interface called INotificationType
   
}
