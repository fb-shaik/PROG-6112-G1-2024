
package lu3_notificationapp_iterface;

import javax.swing.JOptionPane;


public class SMS implements INotificationType{

    @Override
    public void sendNotification() 
    {
    
            JOptionPane.showMessageDialog(null, "Sending SMS Notification!");
    }
    
}
