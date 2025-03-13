/*
 * Anonymous Objects are the Objects created without any reference. When we normally create anobject we have to assign it a varible 
 * which inturn creates some space in heap memory with that variable name for reference. 
 * In case of Anonymous object, we do not assign any variable to it and hence there is no reference to it. 
 * WE CANNOT REUSE ANONUMOUS OBJECT
 */
class Demo{
    public Demo(){
        System.out.println("Object Created.");
    }
    public void show(){
        System.out.println("THis is an output from DEMO");
    }
}
public class AnonymousObjects {
    public static void main(String[] args) {
        // Normal object creation: process of creation of object
        Demo demo; //Declaring object
        demo = new Demo(); //initializing an object
        demo.show(); //using an object

        // Anonymous Objects - These objects are not reusable since these are not referenced. There is no space allocated in heap for these
        // Anonymous object are not assigned to any variable/reference
        new Demo().show();
    }
}
