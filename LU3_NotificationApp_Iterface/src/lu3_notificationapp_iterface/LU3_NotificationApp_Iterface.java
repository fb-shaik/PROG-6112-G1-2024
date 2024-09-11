
package lu3_notificationapp_iterface;

import javax.swing.JOptionPane;
public class LU3_NotificationApp_Iterface {

    /**
     * Notification app that simulates sending of different type of notifications
     * Email, SMS, Push Notification via a GUI
     * Interface will define the common behaviours & constants
     * Implement those behaviours across the different classes
     */
    public static void main(String[] args) {
        //prompt to user to input the type of notification
        String input = JOptionPane.showInputDialog("Enter notification type (EMAIL, SMS, PUSH NOTIFICATION)");
        
        //create an object that will allow for use of the implemented interface class
        INotificationType notification;
        
        //set-up a switch case to determine which version of the interface is to be implemented
        //meaning based on the input type call the respective class (Email, SMS, Push Notification)
        switch(input.toUpperCase())
        {
            case INotificationConstants.EMAIL: //makes use of the constants declared as an interface
                    notification = new Email(); //creates an object for the respectibe class that has implemented the interface
                    break;
             
            case INotificationConstants.SMS: //makes use of the constants declared as an interface
                    notification = new SMS(); //creates an object for the respectibe class that has implemented the interface
                    break;       
                    
            case INotificationConstants.PUSH: //makes use of the constants declared as an interface
                    notification = new PushNotification(); //creates an object for the respectibe class that has implemented the interface
                    break;        
                    
            default:
                        JOptionPane.showMessageDialog(null, "Invalid notification");
                        return;
        }
        
        notification.sendNotification();
        JOptionPane.showMessageDialog(null, "Notification Sent: " + input);
    }
    
}
