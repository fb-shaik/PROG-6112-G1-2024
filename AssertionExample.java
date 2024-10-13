
package lu4_chapter12_error_exception_handling;

/*
Demo of the use of Assertions in java app
An assertion is used to validate assumptions in the app
Main method contains an assertion to check the validity of the 'age' variable
If the condition is not met/false, an AssertionError will be thrown
 */
public class AssertionExample {

    public static void main(String[] args) {
        //initialize 'age' variable to hold a value of 15 
        int age = 15;
        
        //this is the assert statement that will check the age is 18 & above
        //Syntax: assert condition : errorMessage;
        assert age >= 18 : "Age must be 18 or older!";
        
       // System.out.println("Age is: " + age); //print to console if the assertion is successful
    }
    
}
