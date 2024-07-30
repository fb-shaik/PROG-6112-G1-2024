
package lu1_.pkg2darray_methods;

//Simple app to explore the use of 2D arrays & methods

public class LU1_2DArray_Methods {

    public static void main(String[] args) {
        
        //Create a 2D array that will hold 3R & 3C of integer values
        //Syntax 2D Array: dataType [R][C] arrayName = {{R/C},{R/C},{R/C}};
        int [][] values = {
                                        {1,2,3},
                                        {4,5,6,},
                                        {7,8,9}
                                     };  
        //pass 2D array as an argument to the sumArray method
        int result = sumArray(values);
        
        //Display the result of the method call
        System.out.println("The sum of all the elements in the 2D-array is: " + result);
    }
    
    //create a method to calculate the sum of all the elements stored in the 2D array
    //Method Parts: Header, Body,Return
    public static int sumArray(int [][] array)
    { //create a nested loop to calculate the sum of all elements
    
        //Step 1: declare a variable to hold total sum
        int sum = 0;
        //Step 2: Set up nested loop
        //Outer loop iterates over each row
        for (int i = 0; i <array.length; i++)
        {//Inner loop iterates over each column in the current row                
               for(int j = 0; j <array[i].length; j++)
               {
                   //Add the current element to the sum variable
                   sum += array[i][j];
               }         
         }
        //Step 3: return the total sum    
        return sum;
    }
    
}
