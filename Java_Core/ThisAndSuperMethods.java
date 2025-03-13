/*
 * Super() method are used to call the constructors of the Parent Class. Super() is a method which exists in all the constructors 
 * by default as the first statement just invisible to us.
 * Whenever we call Super() method, it will always call the Default constructor.
 * we can play around with Super() method by parameterizing it. (which will call the parameterized constructor of parent class.)
 * 
 * This() method is used specifically to call the default constructor of the current class.
 * 
 */


class A{
    public A(){
        // Why do we have super() method in A, since it is not extending anything?
        // because all the classes are by default calling OBJECT class in JAVA internally. 
        // Hence, we have super() availble in parent class as well.
        super();
        System.out.println("inside A default");
    }

    public A(int a){
        super();
        System.out.println("inside A param "+a);
    }
}

class B extends A{
    
    public B(){
        super(); //We can also call a different constructor of A from here if we modify the parameter in the Super() method.
        System.out.println("inside B default");
    }
    
    public B(int a){
        super(55); //this works because A class has a Parameterized constructor A(int a)
        System.out.println("inside B param "+a);
    }
    
    public B(String s){
        this(); //this will call the constructor of B class first and then execute the below statements. we can modify the parameters like this(6)
        System.out.println("inside B String "+s);
    }
}

public class ThisAndSuperMethods {
    public static void main(String[] args) {
        System.out.println("-----------------------------Default constructor");
        B obj = new B(); //This statement will call the default constructor of B
        System.out.println("-----------------------------Param constructor");
        B newOb = new B(5); //This statement will call the parameterized constructor of B
        System.out.println("-----------------------------String constructor");
        B strOb = new B("str"); //This statement will call the String Parameter constructor of B which is gonna use This() method
    }
}
