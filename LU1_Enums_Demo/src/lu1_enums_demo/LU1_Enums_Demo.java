/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lu1_enums_demo;


/*Simple App to explore the use of enums (Enumerations)
    Enums are a fixed set of constants
    Treated as a special data-type
    Enumerations are treated as objects of the enum type
    Written in uppercase letter & accessed via the dot operator
    EnumType.EnumValue
*/
public class LU1_Enums_Demo {

    //syntax to declare an enum:
    // enum enumName {ENUM_VALUE1, ENUM_VALUE2,  ENUM_VALUE3,  ENUM_VALUE4}

    public enum TrafficLight {RED, YELLOW, GREEN, BLINKING}
            
    public static void main(String[] args) {
        
        //Used a for-each loop to iterate through all the enum values
        //Makes use of the values() method
        for(TrafficLight light : TrafficLight.values())
        
         
         //Used the switch case to print out a message based on the value of the currentLight variable
         switch(light)
         {
             case RED: 
                 System.out.println("Stop!");
                 break;
                 
             case YELLOW:
                 System.out.println("Move faster!");
                 break;
             
             case GREEN:
                 System.out.println("GO!!!!");
                 break;
                 
             case BLINKING:
                 System.out.println("Caution, Proceed carefully!");
                 break;
         
         }
   
    }
    
}
