
package lu3_bakingapp_interface_abstract;

/*
    Subclass implementation
    This class extends the abstract Recipes class
    Inherit all fields & behaviours of Recipes class
    Provides concrete implementation of the abstract method printRecipes()
 */
public class ProcessRecipes extends Recipes
{
    
    //this is the inheritance aspect. We need the Parent constructor to build child objects
    public ProcessRecipes(String ingredients, int timeToMake, String difficultyLevel) {
        super(ingredients, timeToMake, difficultyLevel);
    }

    
    @Override
    public void printRecipes() 
    {//here we provide the concrete implementation for the printRecipes method from the IRecipe class
        System.out.println("\nRecipe Details: ");
        System.out.println("Ingredients: " + getIngredients());
        System.out.println("Time to make: " + getTimeToMake() + " minutes");
        System.out.println("Difficulty Level: " + getDifficultyLevel());
    }
    
}
