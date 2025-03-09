/*
 * Static variable is used to set a variable value common among all the objects or wherevere this variable is used.
 * we do not have a separate static variable for different objects. it is created once and reused by all instances.
 * 
 * Static variable must be called using it's class name. in this reference, Mobile.model is the right way to call the static variable.
 * instead of calling via mob.model/mob1.model.
 * 
 * we have a separate area in JVM allocated to store all the static variables. 
 */

class Mobile{
    String brand;
    int price;
    static String model; //Mking this variable as static so this can be constant among all the objects.
    
    public void show(){
        System.out.println("Brand: "+brand+" Price: "+price+" Model: "+model);
    }
}

public class StaticOverview {
    public static void main(String[] args) {
        
        
        Mobile mob = new Mobile();
        mob.brand = "Apple";
        mob.price = 89999;
        // mob.model = "Smartphone";
        
        Mobile mob1 = new Mobile();
        mob1.brand = "Samsung";
        mob1.price = 45999;
        // mob1.model = "Smartphone";
        
        Mobile mob2 = new Mobile();
        mob2.brand = "Nokia";
        mob2.price = 39999;
        // mob2.model = "Smartphone"; 
        
        // mob1.model = "Flip Phone"; //this change will affect all the other objects of the same class. run below code and see it's output
        
        // We are getting warning for each model is due to model being a static variable which should be called via it's class name. 
        // for example:
        Mobile.model = "cellphone";
        
        // So even if we call the variables via instances, we will get the static variable value assigend above.
        mob.show();
        mob1.show();
        mob2.show();
    }
}
