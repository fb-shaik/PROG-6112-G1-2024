/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorpanelexample;

import javax.swing.*;
import java.awt.*;

public class ColorPanelExample extends JFrame {
    public ColorPanelExample() {
        setSize(400, 300);
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);  // Set background color to red

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);  // Set background color to blue

        setLayout(new GridLayout(1, 2));  // Divide JFrame into 2 columns

        add(redPanel);  // Add panels to the JFrame
        add(bluePanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorPanelExample().setVisible(true);
    }
}