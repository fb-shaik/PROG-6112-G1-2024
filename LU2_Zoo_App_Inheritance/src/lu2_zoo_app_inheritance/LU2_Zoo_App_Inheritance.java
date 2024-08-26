/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lu2_zoo_app_inheritance;

public class LU2_Zoo_App_Inheritance {

    public static void main(String[] args) {
        //Create Zoo object
        Zoo zoo = new Zoo(); 
        
        //Create specific animal objects (Lion, Elephant, Giraffe)
        Lion lion = new Lion("Simba", 5, "White"); //creates a Lion Object
        Elephant elephant = new Elephant("Dumbo", 10, "African Elephant");
        Giraffe giraffe = new Giraffe("Melman", 7);
        
        //Add animal objects to the zoo
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(giraffe);
        
        //Display all animals in the zoo
        zoo.showAllAnimals();
        
        //Specific actions for each animal
        lion.hunt();
        elephant.bath();
        giraffe.graze();
        
        System.out.println("Simba is " + lion.colour + " in colour");
    }
    
}
