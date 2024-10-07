package lu4_chapter12_error_exception_handling;

// Simple application to illustrate error handling in Java.
// This program demonstrates how a StackOverflowError can occur due to 
// infinite recursion and how to handle it using try-catch-finally blocks.

public class LU4_Chapter12_Error_Exception_Handling {

    public static void main(String[] args) {

        try {
            // This line of code will trigger the StackOverflowError because 
            // the method `recursiveMethod()` keeps calling itself indefinitely.
            recursiveMethod();
        } 
        catch (StackOverflowError e) { 
            // Catch block specifically for handling StackOverflowError.
            // This block will execute when the stack memory is exhausted due to deep recursive calls.
            
            System.err.println("Caught a StackOverflow Error: " + e.getMessage());
            // Display a message indicating that a stack overflow error was caught.
            // `e.getMessage()` will typically be `null` for StackOverflowError, but it helps show the concept.
        } 
        finally {
            // The finally block always executes, regardless of whether an exception is caught or not.
            // It is used here to print a message indicating that the program has handled the error gracefully.
            System.out.println("The program encountered a stack overflow error but gracefully exited");
        }
    }

    // A simple method that recursively calls itself, causing infinite recursion.
    // This will result in a StackOverflowError because each recursive call adds a new frame to the call stack,
    // which eventually fills up the stack memory, leading to an overflow.
    public static void recursiveMethod() {
        // Infinite recursion occurs here as the method calls itself without a base condition.
        recursiveMethod();
    }
}
