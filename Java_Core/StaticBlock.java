/*
 * We have a special block of code to overcome a big issue for static variable initialization:
    * When we try to initialize a static variable (model in our case) inside a constructor, every time we create one more object, it'll call the construct. 
    * but why model (static) has to initialize every time?
    * I feel that the name variable, which is static, should only be initialized ony once.
 *
 * Now, in the static block, we can basically initialize the variable, the static variable.
 * Now the good thing about this is the static block will be called only once. Irrespective of how many times an object is careated,
 * Static block is called only once.
 * 
 * Question: Why is static block called always first, even before constructor?
 * Ans: Everytime a class loads, it goes to class loader. Mind that a class is always loaded once. 
 * Now when the class loads, we have the static block present inside class which is loaded and initialized,
 * even before an object creation and constructor call.
 * 
 */

class Mobile {
    String brand;
    int price;
    static String model; // Mking this variable as static so this can be constant among all the objects.

    //we can do this way, where we initialize model inside a constructor. Every time a constructor is called, we will initialize model.
    public void Mobile() {
        brand = "";
        price = 300;
        // model = "Phone";
        System.out.println("inside mobile block");
    }

    // but to do it in a better way we will create a static block, which is only called once.
    static{
        model = "Phone";
        System.out.println("inside static block");
    }

    // instance method
    public void show() {
        System.out.println("Brand: " + brand + " Price: " + price + " Model: " + model);
    }
}
public class StaticBlock {
    public static void main(String[] args) {

        Mobile mob = new Mobile();
        mob.brand = "apple";
        Mobile mob1 = new Mobile();
        mob1.brand = "Samsung";
        
        mob.show();
        mob1.show();

        // What if we dont want to create any object, how to load a class into a class loader?
        // Class.forName("Mobile"); //This would require an exception - classNotFoundException to be thrown for safety measures.
        // this would be required sometimes when doing JDBC connection/operations.
    }
    
}
