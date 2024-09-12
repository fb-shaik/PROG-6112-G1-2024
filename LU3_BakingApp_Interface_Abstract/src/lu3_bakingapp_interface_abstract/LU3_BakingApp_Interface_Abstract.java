
package lu3_bakingapp_interface_abstract;

import java.util.Scanner; //import needed for the Scanner class


public class LU3_BakingApp_Interface_Abstract {

    /*
        Application to handle and display baking recipes. 
     */
    public static void main(String[] args) {
        //create a scanner object to hold user input
        Scanner scanner = new Scanner(System.in);
        
        //prompt the user for recipe details 
        System.out.print("Enter list of ingredients: ");
        String ingredients = scanner.nextLine();
        
        System.out.println("Enter the time to make this recipe (in minutes): ");
        int timeToMake = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter the difficulty level for this recipe: ");
        String difficultyLevel = scanner.nextLine();
        
        //create an instance of the ProcessRecipes class with user input
        ProcessRecipes recipe = new ProcessRecipes(ingredients, timeToMake, difficultyLevel);
        
        //display the recipe details
        recipe.printRecipes();
        
        //close scanner
        scanner.close();
        
        
    }
    
}
