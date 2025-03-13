
class Computer{

    public void show(){
        System.out.println("In Computer show");
    }
}

class Laptop extends Computer{
    public void show(){
        System.out.println("In Laptop show");
    }
}

class Calcie extends Computer{
    public void show(){
        System.out.println("In Calcie show");
    }
}
class Random {
    public void show(){
        System.out.println("In random show");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Laptop obj = new Laptop(); //Normal initialization of Laptop object.
        //Can we create Reference of Computer and object of Laptop?
        Computer obj1 = new Computer(); //here Obj1 is reffered to Computer with object of Laptop. Meaning, Laptop is a Computer.
        obj1.show();
        
        obj1 = new Laptop(); //here Obj1 is reffered to Computer with object of Laptop. Meaning, Laptop is a Computer.
        obj1.show();

        // so now if we want to update obj1 to Calcie obj
        obj1 = new Calcie();
        obj1.show(); //it will print calcie

        // We were able to get outputs because all these classes were related to Computer Parent so no Type mismatch.

        // till here it was possible to edit obj1 to child classes of Computer, now let's see if this happesn with random.
        // obj1 = new Random(); //this is giving type mismatch error because Random is not related to Computer in any format.( either object wise or as an Extension)
        

    }
}

// WE can only have the reference of parent and object of child. 
// if we introduce a new Class D and try to assign the A object reference to D object, it will give error.
