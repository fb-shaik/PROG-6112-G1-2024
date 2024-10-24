/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonexample;

import javax.swing.*;
import java.awt.event.*;  // Import event-handling classes

public class ButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Example");
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {  // Attach event listener
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
            }
        });

        frame.add(button);  // Add button to the JFrame
        frame.setSize(300, 200);  // Set size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);  // Show the window
    }
}