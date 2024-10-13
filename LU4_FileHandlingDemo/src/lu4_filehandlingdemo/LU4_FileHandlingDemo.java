package lu4_filehandlingdemo;

/*
Simple build to explore the difference between File, Path, Files, Paths
File: Represents file paths but has limited functionality (java.io)
Path: Represents file paths in a modern, flexible way (java.nio)
Files: Utility class for file & directory operations using Path (java.nio)
Paths: Utility class for creating Path instances (java.nio)
*/

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class LU4_FileHandlingDemo {

    public static void main(String[] args) {
        // 1. Using File class (Old approach)
        // Create an instance of File representing a file named "sample.txt"
        File file = new File("sample.txt");
        try {
            // Attempt to create a new file with the specified name
            if (file.createNewFile()) {
                // If the file did not exist and was created successfully
                System.out.println("File was created using File class: " + file.getAbsolutePath());
            } else {
                // If the file already exists
                System.out.println("File already exists: " + file.getAbsoluteFile());
            }
        } catch (IOException ex) {
            // Handle exceptions that may occur while creating the file
            System.out.println("An error occurred while creating the file using File class.");
            ex.printStackTrace();
        }

        // 2. Using Path & Paths classes (Modern approach)
        // Create an instance of Path representing a file named "nio_sample.txt"
        Path path = Paths.get("nio_sample.txt");
        try {
            // Check if the file does not exist using Files utility class
            if (Files.notExists(path)) {
                // Create the file if it does not exist
                Files.createFile(path);
                System.out.println("File created using Path & Files: " + path.toAbsolutePath());
            } else {
                // If the file already exists
                System.out.println("File exists already: " + path.toAbsolutePath());
            }
        } catch (IOException ex) {
            // Handle exceptions that may occur while creating the file
            System.out.println("An error occurred while creating the file using Path & Files.");
            ex.printStackTrace();
        }
    }
}

/*
Summary of File vs. Path & Files:
- File class (java.io) represents a file path in an older, less flexible way, offering basic operations.
- Path (java.nio.file.Path) provides a modern approach to represent file paths.
- Files (java.nio.file.Files) offers powerful utility methods to work with files and directories, enhancing capabilities and making operations easier.
- Paths (java.nio.file.Paths) is a utility class to create Path instances in a convenient way.
*/