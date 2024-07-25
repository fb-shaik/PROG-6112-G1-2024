
package lu1.two_d_array_demo;
//Simple app build to explain the use of 2D Arrays

import javax.swing.*; // *: Wildcard
public class LU1Two_D_Array_Demo {

    public static void main(String[] args) {
       
        /*
            1D array syntax: dataType arrayName[size] = {elements};
            2D array syntax: dataType arrayName[Rows][Columns] = 
                { start of outer {} brace
                    {R1, R1, R1},
                    {R2, R2, R2),
                    {R3, R3, R3},
                }; close of the outer {} brace
        */
    
          //declare a 2D array that will have 4 rows & 3 columns  
          int [][] rental = 
                                        { //C1,   C2,    C3
                                            {400, 800, 1000}, //R1
                                            {550, 950, 1100}, //R2   
                                            {600, 1000, 1250}, //R3
                                            {750, 1250, 1500},//R4
                                      };
        
          
            String userEntry; //user prompt 
            int floors; // holds the value for which floor the user wishes to rent on
            int bedrooms; //holds the user value for the number of bedrooms they are looking for
            
            //JOptionPane prompt to ask the user which floor & number of bedrooms they are looking for
            userEntry = JOptionPane.showInputDialog("Enter which floor you wish to rent on (1-4) :");
            floors = Integer.parseInt(userEntry);
            
            //JOptionPane prompt to ask the user which floor & number of bedrooms they are looking for
            userEntry = JOptionPane.showInputDialog("How many bedrooms would you like to have (1-3) :");
            bedrooms = Integer.parseInt(userEntry);
            
            //JOptionPane to show the result based on the above user provided values. This should return the 
            // rental price based on the RC index of the input 
            JOptionPane.showMessageDialog(null, "The rent for a " + bedrooms + " bedrooms " + " on the "
                                                                        + floors + " floor will be R " + rental[floors - 1][bedrooms-1]        
                                                                      );
            
    
    }
    
}
