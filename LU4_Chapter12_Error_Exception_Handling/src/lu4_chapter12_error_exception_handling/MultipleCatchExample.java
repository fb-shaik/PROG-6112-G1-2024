package lu4_chapter12_error_exception_handling;

// Simple application to illustrate handling exceptions using multiple catch blocks.
// This example demonstrates how to handle specific exceptions and a generic exception.

import java.util.Scanner; // Import the Scanner class for user input
import java.util.InputMismatchException; // Import InputMismatchException for handling invalid input types

public class MultipleCatchExample {

    public static void main(String[] args) {
        try {
            // Create a Scanner object to read user input
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter an integer value
            System.out.println("Enter an integer: ");

            // Attempt to read the integer value from the user
            int number = input.nextInt(); // This line may throw InputMismatchException if input is not a valid integer

            // If no exception is thrown, display the entered number
            System.out.println("You have entered: " + number);
        } 
        catch (InputMismatchException ex) { 
            // This catch block handles scenarios where the user input is not a valid integer.
            // If the user inputs a non-integer value (e.g., a string or floating-point number), this block will be executed.
            System.out.println("Please enter a valid integer!"); // Display a user-friendly message
        } 
        catch (Exception ex) { 
            // This generic catch block handles all other types of exceptions that might occur.
            // It's good practice to have a generic catch block to capture unexpected exceptions.
            System.out.println(ex.getMessage()); // Display the exception message if any
            System.out.println("An unknown error occurred"); // Indicate that an unexpected error occurred
        }
    }
}
