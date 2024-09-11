
package lu3_notificationapp_iterface;

import javax.swing.JOptionPane;


public class Email implements INotificationType
{

    @Override
    public void sendNotification() 
    {
        JOptionPane.showMessageDialog(null, "Sending Email Notification!");
    }
    
}
