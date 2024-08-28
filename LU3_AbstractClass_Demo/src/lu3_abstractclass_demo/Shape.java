
package lu3_abstractclass_demo;

//Syntax: abstract class NameClass >>>> will be the parent / base class
abstract class Shape {
    protected String color; //a field of the base class

    public Shape(String color) {
        this.color = color;
    }
    
    /*Abstract Method: Method with no body, just a method name
        Syntax:
        accessSpecifier abstract void/ReturnDatatype MethodName(); 
    */
    //Abstract method: All shapes must be able to calculate area
    public abstract double calculateArea();
    
    //Concrete Method: A method with a method body. It has logic to implement
    //Method that has a common behaviour across all the sub-classes
    public void displayColor()
    {//the logic to implement across all the sub-classes
        System.out.println("This shape is " + color);
    }
    
    
}

/*
Abstract Class
- An abstract class in Java is a class that cannot create objects on its own
- This means no objects can be instantiated directly from the class
- This class can have concrete methods (methods that have a body) 
& abstract methods(methods without any implementation)
- Abstract classes are used when you want to provide a common base class for 
subclasses, but the base class cannot create objects directly
- Used when you want to share code among closely related classes
- Abstract classes cannot be marked final as this does not allow for inheritance
*/


/*
Access modifier:
protected is an access modifier in Java, along with public, private, and default (no keyword).
Visibility:
protected members (variables, methods, nested classes) are accessible:

Within the same class
In subclasses (even if they're in a different package)
In the same package

Purpose in abstract classes:
In the context of abstract classes and inheritance, protected is often used to:
a) Allow subclasses to access and modify certain fields or methods
b) Keep implementation details hidden from unrelated classes
c) Provide a level of encapsulation while still enabling inheritance
*/