/*
 * Static variable is used to set a variable value common among all the objects or wherevere this variable is used.
 * we do not have a separate static variable for different objects. it is created once and reused by all instances.
 * 
 * Static variable must be called using it's class name. in this reference, Mobile.model is the right way to call the static variable.
 * instead of calling via mob.model/mob1.model.
 * 
 * We have a separate area in JVM allocated to store all the static variables.
 * 
 * Static methods are only called in a static reference.
 * Keypoints of static methods:
 * - We cannot directly use non-static varibles inside Static methods
 * - To use Non static variables, we need to pass the object to which that variable belongs to. (check display method)
 * - Instaces (mob) cannot call the static methods.
 * 
 * we use static in PSVM is beacuase Main is the Starting of execution and if not provided, there will not be any execution point 
 * and we will need to create a instance of the Class having Main method
 */

 class Mobile{
    String brand;
    int price;
    static String model; //Mking this variable as static so this can be constant among all the objects.
    
    // instance method
    public void show(){
        System.out.println("Brand: "+brand+" Price: "+price+" Model: "+model);
    }

    public static void display(Mobile obj){
        // Below code will give error because brand and price are both non static and the compiler does not know who these belong to.
        // System.out.println("Brand: "+brand+" Price: "+price+" Model: "+model);
        
        // To overcome that, we need to also pass the Object which tells us Brand and Price belongs to the passed object.
        System.out.println("Calling Static method Display");
        System.out.println("Brand: "+obj.brand+" Price: "+obj.price+" Model: "+model);
        System.out.println();
        
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        
        
        Mobile mob = new Mobile();
        mob.brand = "Apple";
        mob.price = 89999;
        
        Mobile mob1 = new Mobile();
        mob1.brand = "Samsung";
        mob1.price = 45999;
        
        Mobile mob2 = new Mobile();
        mob2.brand = "Nokia";
        mob2.price = 39999;
        
        Mobile.model = "cellphone";
        
        //This won't work as this is a instance method and it cannot be called via static reference. The method also has to be static in order to be called like that.
        // Mobile.show();
        
        // Since display is a static method, it can be called in static reference Only. 
        Mobile.display(mob);
        // mob.display(mob1); //This wont work as it is invalid call.
        
        mob.show();
        mob1.show();
        mob2.show();
        
        // Below statement will be a failure as Instaces (mob) should not call the static methods. uncomment to know the error
        // mob.display(mob);
    }
}
