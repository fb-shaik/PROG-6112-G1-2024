
package lu3_abstractclass_demo;

//This is a child class; we want to implement inheritance via the 
//base abstract class called Shape
public class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
        
    }
    
}
