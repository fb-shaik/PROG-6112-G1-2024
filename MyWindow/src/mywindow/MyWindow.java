/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mywindow;

import javax.swing.JFrame;

/**
 *
 * @author FS
 */
public class MyWindow extends JFrame {
    public MyWindow() {
        setSize(400, 300);
        setTitle("Extended JFrame Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public static void main(String[] args) {
     MyWindow window = new MyWindow();  // Create your custom JFrame
        window.setVisible(true);  // Make it visible
    }
    
}
