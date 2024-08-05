
package lu1_array_class_demo;

/*
    Simple build to explore the use of the Array Class
    This class is part of the java.util.Arrays import
    Provides the use of utility methods for manipulating arrays
    Designed to operate on arrays of objects & primitives
*/

//First step: Make sure to add in the java.util.Arrays import

import java.util.Arrays;
public class LU1_Array_Class_Demo {

    public static void main(String[] args) {
        
        //Create a simple array
        int [] numbers = {5,2,4,3,1,8};  
        
        //Print to view array values
        System.out.println("Original Array Values: " + Arrays.toString(numbers));
        
        //Sort method from the Arrays Class
        Arrays.sort(numbers);
        System.out.println("Sorted Array Values: " + Arrays.toString(numbers));
        
        //fill additional values to the array
        int filledArray [] = new int [5];
        //The fill method will populate the array with a value
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));
        
        /*
            Copying Arrays / Cloning the array
             To duplicate the array you will need:
             1. Original Array which will be the source (we will use the numbers array declared)
             2. A secondary array which will be used as the memory allocation for the copied array
             3. Lenght of the original array
        */
        
        int [] duplicatedArray = new int [6]; //this is set to size six because the numbers array is set to 6
        
        System.arraycopy(numbers, 0, duplicatedArray, 0, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(duplicatedArray));
        
        /*
            System.arraycopy(numbers, 0, duplicatedArray, 0, numbers.length);
            We need to use java.lang.System to actually clone the array
            There is a built-in method: arrayCopy() with a number of parameters need
            Parameters:
                Source Array: The array from which elements are to be copied
                Source Position: The starting position in the source array
                Destination Array: Array to which elements are being copied to
                Destination Position: The starting poistion in the cloned array
                Length: The number of elements to copy 
        */
        
        
    }
    
}
