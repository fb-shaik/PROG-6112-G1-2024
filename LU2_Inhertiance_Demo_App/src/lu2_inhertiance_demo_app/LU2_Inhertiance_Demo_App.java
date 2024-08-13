
package lu2_inhertiance_demo_app;

/*
Inheritance: 
Allows a new class (child/subclass) to inherit fields & methods from an existing class
known as a parent/superclass
This promotes code resusability & a hierarchy between class
*/
public class LU2_Inhertiance_Demo_App {

  
    public static void main(String[] args) {
        
        //let create objects for ParentClass, ChildClass & Child_2
        
        ParentClass parentObject = new  ParentClass();
                //access fields in ParentClass via dot operator
                parentObject.name = "Joe";
                parentObject.age = 10;
                
                //create an object for Child_2
                ChildClass_2 childObject1 = new ChildClass_2();
                //these fields belong to the ParentClass & accessed via inheritance
                childObject1.name = "John";
                childObject1.age = 20;
                
                //create an object for ChildClass
                ChildClass obj = new ChildClass();
                obj.name = "Sam";
                obj.age = 30;
                
                System.out.println("Parent Object:");
                parentObject.displayInfo(); //Display ParentClass object info
                
                System.out.println("ChildClass Object");
                obj.displayInfo();//Display ChildClass object info
                
                
                System.out.println("ChildClass_2 Object");
                childObject1.displayInfo();//Display ChildClass_2 object info
                
                //Now that we added exclusive fields/behaviours to childClass
                //These are only available to the object of that Class (ChildClass)
                obj.schoolName = "Varsity College";
                obj.grade = "A";
                System.out.println("This method below is called from ChildClass");
                obj.displayChildClassInfo();
                
                
                
                
               
                
                
         
    }
    
}
