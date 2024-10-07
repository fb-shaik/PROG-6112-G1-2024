package lu4_chapter12_error_exception_handling;

// Simple application to illustrate exception handling in Java.
// This application takes user input for a numerator and a denominator, 
// performs division, and demonstrates how to handle an ArithmeticException (division by zero).

import java.util.Scanner; // Importing Scanner class for user input

public class Arithematic_Exception {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a Scanner object to read user input
        try {
            // Prompt the user to enter the numerator
            System.out.println("Enter numerator: ");
            int numerator = input.nextInt(); // Read the numerator value from user input

            // Prompt the user to enter the denominator
            System.out.println("Enter denominator: ");
            int denominator = input.nextInt(); // Read the denominator value from user input

            // Perform division. If the denominator is zero, an ArithmeticException will be thrown.
            int result = numerator / denominator; 
            
            // Display the result of the division
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) { 
            // This block handles the exception if a division by zero occurs.
            // Display a friendly error message to the user indicating that division by zero is not allowed.
            System.out.println("Cannot divide by zero!");
        } 
        finally {
            // The finally block executes regardless of whether an exception is thrown or not.
            // It is used here to display a message indicating the end of the program.
            System.out.println("End of program!");
        }
    }
}
