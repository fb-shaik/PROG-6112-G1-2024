/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutexample;

import javax.swing.*;
import java.awt.*;

public class LayoutExample extends JFrame {
    public LayoutExample() {
        setTitle("Layout Manager Example");
        setSize(400, 200);
        setLayout(new FlowLayout());  // FlowLayout places components in a row

        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JTextField("Text Field"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LayoutExample().setVisible(true);
    }
}