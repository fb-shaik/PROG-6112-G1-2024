package lu4_filewriterdemo;

// Import necessary classes for file handling operations
import java.io.*; // This import statement includes FileWriter and PrintWriter classes for writing to files, and IOException for handling errors


public class LU4_FileWriterDemo {

    
    public static void main(String[] args) {
        
        // Define the name of the file to be created or accessed
        // This is a relative path, which means the file "example.txt" will be created in the project directory
        String filename = "example.txt";

        // Write data to the file using FileWriter and PrintWriter classes
        try (FileWriter filewriter = new FileWriter(filename)) {
            // Create a PrintWriter object to write formatted text data to the file
            PrintWriter printWriter = new PrintWriter(filewriter);

            // Write text data to the file, each line is added using `println` method
            printWriter.println("Hello World!"); // Writes the first line to the file
            printWriter.println("This is a simple example of file IO in Java"); // Writes the second line to the file

            // Print a confirmation message to the console once the writing is completed
            System.out.println("Data was written to a file");
        } 
        
        // Catch block to handle potential IOException
        // This exception is thrown if there are issues creating, accessing, or writing to the file
        catch(IOException ex) {
            System.out.println("An error occurred!"); // Display a general error message
            ex.printStackTrace(); // Print detailed information about the error (stack trace)
        }
    }
}
