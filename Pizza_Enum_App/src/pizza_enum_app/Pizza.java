
package pizza_enum_app;

import static pizza_enum_app.Size.SMALL;


public class Pizza {
    //create an instance of the Size enum
    Size pizzaSize;
    
    //create a parameterized constructor to set the pizza size
    //this will require you to pass the enum as the parameter
    
    public Pizza(Size pizzaSize)
    {
        this.pizzaSize = pizzaSize;
    }
    
    //create a method: orderPizza()
    //for this method make use of switch caseto determine the pizza size
    //return the appropriate message for the size ordered
    public String orderPizza()
    {
        switch(pizzaSize)
        {
            case SMALL:
                    return "You have ordered a small pizza";
            case MEDIUM:
                    return "You have ordered a medium pizza";     
            case LARGE:
                    return "You have ordered a large pizza";       
            case SUPER:        
                    return "You have ordered a super pizza";
            default:        
                     return "Invalid pizza size choice";
        }
    
  
    }
    
}
