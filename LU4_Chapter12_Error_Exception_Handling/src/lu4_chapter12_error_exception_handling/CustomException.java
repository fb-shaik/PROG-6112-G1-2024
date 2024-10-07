package lu4_chapter12_error_exception_handling;

// This program demonstrates the creation and use of a custom exception in Java.
// It includes three classes: CustomException (main class), HighBalanceException (custom exception class), 
// and BankAccount (class that triggers the exception based on business logic).

public class CustomException {

    public static void main(String[] args) {
        try {
            // Create a BankAccount object with an initial balance of 150,000
            // This balance exceeds the set limit of 100,000, so it will trigger the HighBalanceException
            BankAccount account = new BankAccount(150000);
        } 
        catch (HighBalanceException ex) {
            // This catch block handles the custom exception HighBalanceException.
            // It prints the error message provided when the exception is thrown.
            System.out.println(ex.getMessage());
        }
    }
}

/**
 * Simple app to illustrate a custom exception.
 * We define a class called `HighBalanceException` that extends from the built-in `Exception` class.
 * A second class, `BankAccount`, will make use of the 'throws' clause to declare this checked exception.
 */
class HighBalanceException extends Exception {
    // Constructor to initialize the exception message
    public HighBalanceException(String message) {
        super(message); // Pass the custom message to the parent Exception class
    }
}

/**
 * Class to simulate a simple Bank Account.
 * It contains a constructor that throws a custom exception if the balance exceeds a predefined limit.
 */
class BankAccount {
    private double balance; // Instance variable to hold the account balance

    // Constructor that takes a balance as a parameter and checks if it exceeds the limit
    public BankAccount(double balance) throws HighBalanceException {
        // Check if the provided balance is greater than 100,000
        if (balance > 100000) {
            // If true, throw a custom HighBalanceException with a relevant message
            throw new HighBalanceException("Balance exceeds the limit!");
        }
        // If no exception is thrown, set the balance
        this.balance = balance;
    }
}
