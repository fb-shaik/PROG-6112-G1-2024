// Simple app to illustrate the use of Bubble Sort
package bubble_sort_demo_lu1;

// Import statement: JOptionPane Build
import javax.swing.JOptionPane;

public class Bubble_Sort_Demo_LU1 {

    public static void main(String[] args) {
        // Prompt the user & get the number of elements for the array
        int arraySize = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Please enter the number of elements to store in the array: "));
        
        // Create an array to store the elements
        int[] arr = new int[arraySize];
        
        // Populate the array with the user provided values & store in the array
        for (int i = 0; i < arraySize; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Enter element # " + (i + 1) + " : "));
        }
        
        // Display the unsorted values in the array to the user
        // Make use of a StringBuilder (create an object from the StringBuilder class)
        StringBuilder display = new StringBuilder("Original Array Values\n");
        for (int i = 0; i < arraySize; i++) {
            display.append(arr[i]).append(" \n"); // escape sequence for new line
        }
        JOptionPane.showMessageDialog(null, display.toString());
            
        // Call the bubble sort method
        bubbleSort(arr);
       
        // Display the sorted values in the array back to user (use StringBuilder)
        StringBuilder sortedArray = new StringBuilder("Sorted Array Values: \n");
        for (int i = 0; i < arraySize; i++) {
            sortedArray.append(arr[i]).append(" \n");
        }
        JOptionPane.showMessageDialog(null, sortedArray.toString());
    }
    
    // Create the bubble sort method
    // accessSpecifier; static/Non-Static; dataType-Return/void; MethodName(parameterList){}
    public static void bubbleSort(int[] arr) {
        // Method Body
        // Determine the array size
        int n = arr.length; // help the For-Loop keep in bounds based on the array size/length
            
        // Helps with the switch of elements out of order
        boolean swapped; 
            
        /* Nested Loop is used to complete the bubble sort
           OuterLoop: Will be used to pass the number of iterations completed based 
                      on the array size
           InnerLoop: The actual swap of elements occur here                    
        */
        // Outer Loop
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Inner Loop
            for (int j = 0; j < n - 1 - i; j++) { // Added `- i` to optimize the loop
                // Elements now are swapped
                // [0] > [1]
                if (arr[j] > arr[j + 1]) { // Swap around the elements; introduce the temp variable
                    int temp = arr[j]; // 9
                    arr[j] = arr[j + 1]; // 2
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements are swapped in the inner loop, array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}
