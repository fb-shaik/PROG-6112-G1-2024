
package pizza_enum_app;
/*
App to show the use of enums
Simple order system for a Pizza Store
enum used to hold Pizza sizes on offer

*/

import javax.swing.*;

public class Pizza_Enum_App {

    
    public static void main(String[] args) {
    
        while(true){
    //Display message to welcome the user
            JOptionPane.showMessageDialog(null,"Welcome to Pizza-Hut");
        
//Create a string of the available sizes on offer
            String availableSizes = "Available Sizes: SMALL, MEDIUM, LARGE, SUPER";
        
        
//Display the above string to the user
            JOptionPane.showMessageDialog(null, availableSizes, 
                                                                        "Available Sizes", JOptionPane.INFORMATION_MESSAGE);
            
//Prompt the user to enter their pizza size choice; Make sure to include an option to exit as well
            String userInput = JOptionPane.showInputDialog(null, "Enter the size of pizza you wish to order, or type 'exit' to quit");
        
//provide the code to handle the input & call the appropriate response from orderPizza()
 if(userInput == null || userInput.equalsIgnoreCase("exit"))
    {
        JOptionPane.showMessageDialog(null, "Thank you for using Pizza-Hut ordering system, Good-bye!");
        break; //Exit the loop to quit the program
    }
 else
 {
     try{
     //the expected behaviour will be placed in the try block
     //instance of the enum
            Size chosenSize = Size.valueOf(userInput.toUpperCase());
     //instance of the Pizza class to access the orderPizza() method
     Pizza pizza = new Pizza(chosenSize);
     //get the display message from the orderPizza() based on input
     String orderMessage = pizza.orderPizza();
     JOptionPane.showMessageDialog(null, orderMessage);
     }
     catch(IllegalArgumentException e ) 
     {
         //Handle an invalid input
         JOptionPane.showMessageDialog(null, 
                 "Invalid pizza size choice. Please try again", "Error", 
                 JOptionPane.ERROR_MESSAGE);
     }
 }
        
    }
    
}
}