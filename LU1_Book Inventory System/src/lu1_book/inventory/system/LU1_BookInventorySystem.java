/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lu1_book.inventory.system;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author FS
 */
public class LU1_BookInventorySystem {
private static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Add Book", "Display All Books", "Update Book", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Book Inventory System",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    addBook();
                    break;
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    updateBook();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private static void addBook() {
        String title = JOptionPane.showInputDialog("Enter Title:");
        String author = JOptionPane.showInputDialog("Enter Author:");
        String ISBN = JOptionPane.showInputDialog("Enter ISBN:");
        String publisher = JOptionPane.showInputDialog("Enter Publisher:");

        books.add(new Book(title, author, ISBN, publisher));
        JOptionPane.showMessageDialog(null, "Book added successfully!");
    }

    private static void displayAllBooks() {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private static void updateBook() {
        String ISBN = JOptionPane.showInputDialog("Enter ISBN to update:");
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                book.setTitle(JOptionPane.showInputDialog("Enter New Title:", book.getTitle()));
                book.setAuthor(JOptionPane.showInputDialog("Enter New Author:", book.getAuthor()));
                book.setPublisher(JOptionPane.showInputDialog("Enter New Publisher:", book.getPublisher()));
                JOptionPane.showMessageDialog(null, "Book updated successfully!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Book not found!");
    }
}
