package lu3_bakingapp_interface_abstract;

/*
    Abstract class 
    Will provide a base implementation for the recipe related classes
    Will implement the IRecipe interface
 */
abstract class Recipes implements IRecipes
{
    //add 3 fields
    private String ingredients; //stores the list of ingredients
    private int timeToMake; //stores the prep time in minutes
    private String difficultyLevel; //stores the level of difficulty for the recipe
    
    //generate a constructor taking in all 3 fields
    public Recipes(String ingredients, int timeToMake, String difficultyLevel) {
        this.ingredients = ingredients;
        this.timeToMake = timeToMake;
        this.difficultyLevel = difficultyLevel;
    }
    
    //getter methods for the fields

    public String getIngredients() {
        return ingredients;
    }

    public int getTimeToMake() {
        return timeToMake;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    
    
    
}
