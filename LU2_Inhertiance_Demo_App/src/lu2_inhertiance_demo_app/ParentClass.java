
package lu2_inhertiance_demo_app;

/*
    This class called ParentClass will display the syntax & behaviour of using
    inheritance in java
    The parent class behaves as normal (fields & methods)
*/
public class ParentClass {
    //fields
    String name;
    int age;
    
    //method: This method belongs to the ParentClass
    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class ChildClass_2 extends ParentClass
{
 //currently empty of its own fields & methods
    //using inheritance we are able to access the above ParentClass fields
    //this is done via an object created for this class (ChildClass_2) & dot operator
    
}






