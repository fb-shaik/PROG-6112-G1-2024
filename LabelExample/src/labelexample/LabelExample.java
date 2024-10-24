/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labelexample;

import javax.swing.*;

public class LabelExample extends JFrame {
    public LabelExample() {
        setSize(400, 300);
        setLayout(null);

        JLabel label = new JLabel("Enter your name:");  // Create a label
        label.setBounds(50, 20, 150, 30);  // Set position and size

        JTextField textField = new JTextField();  // Create a text field
        textField.setBounds(50, 60, 200, 30);  

        JButton button = new JButton("Submit");  // Create a button
        button.setBounds(50, 100, 100, 30);

        add(label);  // Add label to JFrame
        add(textField);  // Add text field to JFrame
        add(button);  // Add button to JFrame

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LabelExample window = new LabelExample();  // Create window
        window.setVisible(true);  // Make it visible
    }
}