package lu4_writercomparison;

// Simple build to illustrate the differences between FileWriter & BufferedWriter

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class LU4_WriterComparison {

    public static void main(String[] args) {
        
        String fileName = "fileWriterExample.txt";
        String bufferedFileName = "bufferedWriterExample.txt";
        String content = "This is a line of text to demonstrate the differences between FileWriter & BufferedWriter.\n";
        
        // Using FileWriter (writes characters directly to the file)
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            // Start measuring time for FileWriter
            long startTime = System.nanoTime();
            // Writing the same content to the file 1000 times
            for (int i = 0; i < 1000; i++) {
                fileWriter.write(content);
            }
            // End measuring time for FileWriter
            long endTime = System.nanoTime();
            System.out.println("FileWriter: Time taken to write lines = " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException ex) {
            // Handle exceptions related to file writing
            ex.printStackTrace();
        }
        
        // Using BufferedWriter (buffers characters before writing to the file, reducing IO operations)
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bufferedFileName))) {
            // Start measuring time for BufferedWriter
            long startTime = System.nanoTime();
            // Writing the same content to the file 1000 times
            for (int i = 0; i < 1000; i++) {
                bufferedWriter.write(content);
            }
            // End measuring time for BufferedWriter
            long endTime = System.nanoTime();
            System.out.println("BufferedWriter: Time taken to write lines = " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException ex) {
            // Handle exceptions related to file writing
            ex.printStackTrace();
        }
        
        System.out.println("File writing completed, check the text files for the output display");
    }
}

/*
Summary of FileWriter vs. BufferedWriter:
- FileWriter: Writes characters directly to the file. Each write operation results in immediate I/O, which can be inefficient when writing many small pieces of data.
- BufferedWriter: Buffers characters before writing them to the file, which minimizes the number of I/O operations and generally improves performance. It is faster for repeated write operations because it writes larger chunks of data at once.
- This example demonstrates that BufferedWriter can significantly reduce the time required to write data to a file, especially in scenarios where multiple write operations are performed.
*/