/*
 * This file is showing basic Inheritance using Calculator and MoreCalculator class. Also called as Single-Level Inheritance. (when only two classes are involved.)
 * And also Multi-level Inheritance using ScientificCalculator. ( when more than two classes are involved.)
 * 
 * (Here:  ... ScientificCalculator extends MoreCalculator Extends Calculator)
 *                                     [---------Single Inheritance------]
 *        [----------------Multi-level Inheritance-----------------------]   
 * 
 * 
 * Inheritance is property of Object oriented programmig which allows us to Inherit properties and behaviors of different classes in
 * our working class. This allows us to utilize the methods and properties as needed.
 * 
 * To inherit properties of one class to another class we use : extends Keyword
 * 
 * Inheritance doesn't necissarily depends on a java file, in case of inheritance, if we have the .class file for that Extended class, it will work for current working class as well.
 * 
 * Need of Inheritance: IS - HAS realtionship.
 * Now what is, is, IS. Okay, so example, if we talk about a laptop,so can we say a laptop IS a computer? 
 * So what it means is, laptop got it features from a computer.
 * So that's how you represent something. 
 * You represent a device or a physical entity by referring to its upper model, or you try to take the features of it.
 * 
 *  
 */

public class SingleMulti_Inheritance {
    public static void main(String[] args) {
        ScientificCalculator sCalc = new ScientificCalculator();
        int pow = sCalc.power(4,2);
        
        // Using inherited methods from Advance calculator.
        int mult = sCalc.multiply(2,2);
        int div = sCalc.divison(10, 2);
        int mod = sCalc.modulus(20, 5);

        // This is possible because ScientificCalculator class is able to access the properties of Calculator class via MoreCalculator.
        int add = sCalc.add(5,5);
        int sub = sCalc.substraction(10,5);
        
        System.out.println(add+" "+sub+" "+mult+" "+div+" "+mod+" "+pow);

        // ScientificCalculator is able to use the properties of Calculator class, but the opposite is not possible. Uncomment below to see error.
        // Calculator myCal = new Calculator();
        // myCal.power(4,2);

    }
}
