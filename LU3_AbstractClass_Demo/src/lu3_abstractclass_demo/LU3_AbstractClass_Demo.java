
package lu3_abstractclass_demo;


public class LU3_AbstractClass_Demo {

   //in this main we want to create objects for the subclasses (Circle & rectangle)
    
    public static void main(String[] args) {
        
        //this wont work because we cannot create objects for the Shape class as it is abstract
       // Shape myShape = new Shape("Blue");
        
        //this is allowed due to inheritance: Base Shape object = new ChildClassConstructor()
        //The object created will belong to the child class
        Shape yourCircle = new Circle ("Yellow", 6);
        Circle myCircle = new Circle("Red", 5); //normal way to build a child object
        
        //this is allowed due to inheritance: Base Shape object = new ChildClassConstructor()
        //The object created will belong to the child class
        Shape newRectangle = new Rectangle("Orange", 5, 6); 
        Rectangle rectangle = new Rectangle("Green", 3, 4);
        
        //call the concrete method: displayColor() >>>Works the same for all child classes
        yourCircle.displayColor();
        myCircle.displayColor();
        newRectangle.displayColor();
        rectangle.displayColor();
        
        //call the abstract method: Will be diffrent for each child class implementation
        System.out.println("yourCircle area: " + yourCircle.calculateArea());
        System.out.println("myCircle area: " + myCircle.calculateArea());
        System.out.println("newRectangle area: " + newRectangle.calculateArea());
        System.out.println("rectangle area: " + rectangle.calculateArea());
        
        
    
        
    }
    
}
