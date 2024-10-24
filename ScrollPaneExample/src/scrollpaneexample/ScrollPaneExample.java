/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrollpaneexample;

import javax.swing.*;

public class ScrollPaneExample extends JFrame {
    public ScrollPaneExample() {
        setSize(400, 300);

        JTextArea textArea = new JTextArea(10, 30);  // Create a large text area
        JScrollPane scrollPane = new JScrollPane(textArea);  // Add text area to a scroll pane

        add(scrollPane);  // Add scroll pane to the JFrame

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ScrollPaneExample().setVisible(true);
    }
}