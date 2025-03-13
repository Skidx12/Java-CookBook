/*
 * What is TypeCasting?
 * Converting a variable from one type to another (supportable format)
 * 
 * How to implement this in OOPs reference?
 * see below example: 
 */

//  Parent
 class A{
    public void show(){
        System.out.println("in Show");
    }
 }

// child
 class B extends A{
    public void show2(){
        System.out.println("in Show2");
    }
 }
public class DowncastingAndUpcasting {
    public static void main(String[] args) {
        // obj is a reference variable of type A, which is having an object of B.
        A obj = new B(); //Example of Upcasting - lower (child) type is referring to a higher (parent) type
        obj.show(); //Here the child object knows that .show() method exists since it is an object of B but referring to A.
        //obj.show2(); // this is erroneous becuase although obj is of type B, the reference to obj is of A, and A does not know if .show2() exists.

        // to get this worked, we need to go for Downcasting.
        B obj1 = (B) obj; //Explicit Typecasting
        obj1.show2();
        // Explanation: this is reference of A, but the object is of B. So while assigning, I want the type to be of B
        // This is called downcasting. So this obj is the parent object or parent reference.
        // We are downcasting it to the child reference.
    }

}
