
package lu2_zoo_app_inheritance;

/*
Zoo class: manages a collection of animals & provides functionality to interact with them
 */

import java.util.ArrayList; //will store the animal collection
public class Zoo {
    //A list to store the different type of animals
    //Using the Animal Class as the data-type; hold objects in the ArrayList
    private ArrayList<Animal> animals;
    
    //constructor for Zoo class, initializes with the animal list
    public Zoo()
    {
        //Creates an empty list of animals
        animals = new ArrayList<>(); 
    }
    
    //Method to add an animal to the Zoo
    public void addAnimal(Animal animal)
    {//Adds the animal to the list
        animals.add(animal);
    }
    
    //Method to display information about all animals in the zoo
    public void showAllAnimals()
    {//Iterate over each animal in the zoo
        for (Animal animal : animals)
        {
            animal.displayInfo();//Display the animal's infor
            animal.makeSound();//Call the overridden methods for each specific animal
            System.out.println();
        }
   
    }
     
}
