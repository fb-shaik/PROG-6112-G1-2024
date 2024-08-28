
package lu3_abstractclass_demo;

//This is a child class; we want to implement inheritance via the 
//base abstract class called Shape
public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
       return length * width;
    }
    
    
}
