/*
 * Method overriding is a feature in Java that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. 
 * This is a key aspect of runtime polymorphism in Java, enabling dynamic method dispatch.
 */

class DemoOverride{
    public void show(){
        System.out.println("ParentShow");
    }
    public void display(String joke){
        System.out.println("Parent Joke");
    }
}
class childOverride extends DemoOverride{
    public void show1(){
        System.out.println("ChildShow");
    }
    public void display(String joke){
        System.out.println(joke);
    }

}
public class MethodOverriding {
    public static void main(String[] args) {
        childOverride chd = new childOverride();
        // both parent and child has show methods but with different names.
        chd.show();
        chd.show1();

        // but what will happen with same name methods? how to handle that?
        // now we have 2 display methods, one in Parent, one in child. now if we call display, which one will be called?
        chd.display("burj khalifa is cheaper than a goa hotel...!");

        // now if we run this we get child display as parent display is overriden by child display method.
    }
    
}
