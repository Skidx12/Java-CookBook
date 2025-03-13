/*
 * Here we are extending(Inheriting the properties) the Calculator class. 
 * THis is a one way inheritance. Meaning, Morecalculator is able to use the properties of Calculator class, but the opposite is not possible.
 * 
*/
public class MoreCalculator extends Calculator{
    public int multiply(int a, int b){
        return a*b;
    }
    
    public int divison(int a, int b){
        return a/b;
    }

    public int modulus(int a, int b){
        return a%b;
    }
}
