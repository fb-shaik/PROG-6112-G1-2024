
package lu1_arraylist_demo;

/*
    Simple build to explore the behaviour of ArrayList in java
    Need a java.util.ArrayList import to access this dynamic feature
    This allows for dynamic arrays that can grow as needed (size can be adjusted)
 */

//First need to have the import statement: java.util.ArrayList
import java.util.ArrayList;
import java.util.Arrays;
public class LU1_ArrayList_Demo {
  
    public static void main(String[] args) {
        /*.....................Normal Array.......................*/
        //Syntax: dataType [] ArrayName = new datatype[size];
        int [] arr = new int [2];
        arr[0] = 1; //populate at a speficied index 
        arr[1] = 2;
        System.out.println(arr[0]);
        
        /*.....................ArrayList........................... */
    //Syntax: ArrayList<dataType> arrayListName = new ArrayList<dataType>(could be empty or set initial capacity);
    ArrayList<Integer> arrList = new ArrayList<Integer>(2); //we set an initial capacity of 2 elements in the list
    arrList.add(9);
    arrList.add(10);
    
    //print & see the values added to the arrayList 
        //number of ways to access & print the arrayList elements
            //For Loop, ForEach Loop, toString() method, forEachMethod
            
            //ForEach loop
            System.out.println("ArrayList elements displayed using the FprEach loop");
            for(Integer num : arrList)
                {
                    System.out.println(num);
                }
            
       //add more elements to the List
       arrList.add(12);
       arrList.add(14);
       
         //ForEach loop
            System.out.println("ArrayList elements after adding in more elements");
            for(Integer num : arrList)
                {
                    System.out.println(num);
                }
    
        
        
    }
    
}
