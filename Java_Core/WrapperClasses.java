/*
 * Wrapper classes
 * 
 * For each primitive data type we have a wrapper class for it
 * Int - Integer
 * char - Character
 * double - Double
 */

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 7; //primitive value

        // We are taking primitive value and putting into a wrapper object specifically, this is called Boxing.
        Integer num1 = new Integer(10); //the integer class is Striked means deprecated. Meaning it is not much used now, might be removed in later releases

        // if we want to assign num to num1 directly we can do like below:
        num1 = num; //This is called AutoBoxing, where implicitly it is converted to Integer type

        System.out.println("wrapper num1: " +num1);
        // Alternate way to assign
        // num1 = 8;

        // Assigning the num1 (wrapped) value back to primitive value, we can do this like below
        int abc = num1.intValue();
        System.out.println("unwrapped abc: "+abc);

        // We also have a method where if we have any String value which has integers we can read it as below
        String str = "33";
        // to read and store 33 from the str we need to parse it into integer format
        int strnum = Integer.parseInt(str);
        System.out.println("strNum : "+strnum);


    }
}
