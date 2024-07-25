
package lu1_insertionsort;

//Simple app to demo the use of insertion sort 

import java.util.*; // Console app import
public class LU1_InsertionSort {
    
    public static void main(String[] args) {
        
        //declare an array & print the original values to the user
        //data-Type [] ArrayName = {e1, e2, e3,};
        int [] numArray = {13, 4, 55, 1, 56, 78}; //array has been set to a size of 6
        //subscript [0] > [5]
        
        //print display of the above values to the user
        System.out.println("Original Values in the Array: " + Arrays.toString(numArray));
     
        //apply the insertion sort to the mixed values in the array
        for( int k = 1; k <numArray.length; k++)
        {
            //to apply the insertion sort, need a temp variable to hold the value in question
            int temp = numArray[k]; //this is holding the value at [1]
            int j = k -1; //this is holding the value at [0]
            
            while(j >=0 && temp <= numArray[j]) //both conditions need to be true
            {
                numArray[j + 1] = numArray[j];
                j = j -1;
            }
            numArray [j + 1] = temp;
        }
        
        System.out.println("Sorted Values in the Array: " + Arrays.toString(numArray));
    
    }
    
}
