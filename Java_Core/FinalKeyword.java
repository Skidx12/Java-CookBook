/*
 * Final - Keyword can be used with Variable, Method or Class.
 * 
 * variables - Cannot change value (Constant value)
 * method - Cannot override the method (No method overriding)
 * Class - Cannot extend the class to a sub class. Basically No inheritance.!!
 */

//  Final class example
final class finalex{
    public void show(){
        System.out.println("in finalEx Class");
    }
}

class Test{
    final public int add(){
        return 2+2;
    }
}
class TestExtended extends Test{
    public void show(){
        System.out.println("in TestExtended");
    }

    //Below method will give error, since Test class add method is final, it cannot be overriden
    // public int add(){
    //     return 5+5;
    // }
}

// This below statemtn will give error because finalEx is a final class wich cannot be extended. Final classes are not Extendable(inherited)
// class extendedFinalEx extends finalex{

// }

public class FinalKeyword{
    public static void main(String[] args) {
        // Final variable example
        int num = 8;
        num = 9;
        System.out.println(num); //output = 9 (updated above)

        final int a = 8;
        // a = 10; //Error because final keyword makes the a variable constant. we cannot modify final variables.

    }
}
