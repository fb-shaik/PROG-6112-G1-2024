/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seating_app;

import javax.swing.JOptionPane;

/**
 *
 * @author FS
 */
public class Seating_App {

    
    public static void main(String[] args) {
        TheaterSeating theater = new TheaterSeating();

        while (true) {
            String[] options = {"Display Seating Arrangement", "Book a Seat", "Display Booked Seats", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Theater Seating System",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    theater.displaySeatingArrangement();
                    break;
                case 1:
                    String rowInput = JOptionPane.showInputDialog("Enter row:");
                    String columnInput = JOptionPane.showInputDialog("Enter column:");
                    try {
                        int row = Integer.parseInt(rowInput);
                        int column = Integer.parseInt(columnInput);
                        theater.bookSeat(row, column);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter numbers only.");
                    }
                    break;
                case 2:
                    theater.displayBookedSeats();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }
}