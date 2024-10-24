/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author FS
 */
public class  MyGUI extends JFrame {
      public MyGUI() {
        setSize(400, 300);
        setLayout(null);  // Disable automatic layout to place components freely

        JTextField textField = new JTextField();  // Create text field
        textField.setBounds(50, 50, 200, 30);  // Set position and size
        textField.setToolTipText("Enter your name here");  // Add tooltip

        JButton button = new JButton("Click Me");  // Create button
        button.setBounds(50, 100, 120, 30);  // Set position and size
        button.setToolTipText("This is a button");  // Add tooltip

        add(textField);  // Add text field to the JFrame
        add(button);  // Add button to the JFrame

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      
    public static void main(String[] args) {
         MyGUI window = new MyGUI();  // Create the window
        window.setVisible(true);  // Make it visible
    }
    
}
