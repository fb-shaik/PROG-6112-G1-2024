/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuexample;
import javax.swing.*;

public class MenuExample extends JFrame {
    public MenuExample() {
        setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();  // Create a menu bar

        JMenu fileMenu = new JMenu("File");  // Create "File" menu
        JMenuItem openItem = new JMenuItem("Open");  // Add items to the menu
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(openItem);  // Add items to the File menu
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);  // Add File menu to the menu bar

        setJMenuBar(menuBar);  // Set the menu bar for the JFrame

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add action for Exit item
        exitItem.addActionListener(e -> System.exit(0));  // Close the app when clicked
    }

    public static void main(String[] args) {
        new MenuExample().setVisible(true);
    }
}