
package artist_sales_2d_array;


import java.util.Scanner;
public class Artist_Sales_2D_Array {

  
    public static void main(String[] args) {
        
        //create  1D array to hold the artist names; initialize the artist names as well
        String [] artists = {"Ed Sheeran", "Pink", "Bruno Mars", "Foo Fighters", "Taylor Swift" };
        
        //create a 2D array that will hold products & sales for the artists above
        //This will be 5 artists & 3 product catergories>>>> 5 Rows & 3 Columns
        //Initialize the 2D array based on the sales data provided
        int [][] sales = 
            {    //C1          C2         C3
                {900000, 800000, 500000},//R1 - Artist 1
                {700000, 500000, 500000},//R2 - Artist 2
                {800000, 100000, 50000},//R3 - Artist 3
                {100000, 200000, 200000},//R4 - Artist 4
                {300000, 100000, 50000},//R5 - Artist 5
            };   
        
        //Display the artist names with the corresponding number choice to view their sales across the 3 products
        System.out.println("Artists List:");
        //use a loop to print the 1D array elements
        for( int i = 0; i < artists.length; i++)
            {
                System.out.println((i + 1) + ". " + artists[i]);
            }
        
        //prompt the user to enter a number from 1 to 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-5) to see the artist's sales data:");
        int artistNumber = scanner.nextInt(); //hold the user input which will be used to call the result in the 2D array
        
        //Check if the input is within the valid range (1-5)
        if ( artistNumber < 1 || artistNumber > 5 )
            {
                    System.out.println("Invalid number. Please enter a number between 1 & 5.");
            } 
        else
            {
                //Get the index for the artist based on the user input provided
                    int index = artistNumber - 1; //This will serve as the row index for the 2D array 
                    
                //Get Sales data from the 2D array for the selected artist >>> [R][C]
                int cdSales = sales[index][0]; //retrieves the CD sales for the chosen artist
                int dvdSales = sales[index][1]; //retrieves the DVD sales for the chosen artist        
                int blueRaySales = sales[index][2]; //retrieves the BlueRay sales for the chosen artist
                int totalSales = cdSales + dvdSales + blueRaySales;
  
                //Print the artist name & their sales data
                System.out.println("Artist: " + artists[index]);
                System.out.println("CD Sales: " + cdSales);
                System.out.println("DVD Sales: " + dvdSales);
                System.out.println("BlueRay Sales: " + blueRaySales);
                System.out.println("Total Sales: " + totalSales);
            }
        
        //close scanner
        scanner.close();
    }
    
}
