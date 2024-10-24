/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentpanelexample;

import javax.swing.*;
import java.awt.*;

public class ContentPanelExample extends JFrame {
    public ContentPanelExample() {
        setSize(400, 300);
        JPanel panel = new JPanel();  // Create a content panel
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("Button"));
        panel.add(new JTextField("Enter text"));

        this.getContentPane().add(panel);  // Add the panel to the JFrame

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ContentPanelExample().setVisible(true);
    }
}