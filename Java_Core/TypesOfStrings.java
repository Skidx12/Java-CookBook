public class TypesOfStrings {
    public static void main(String[] args) {
        /*We have two types of String - Mutable and Immutable.
         *  
         * Mutable - Strings that can be changed
         * Immutable - Strings which cannot be changed
         * 
         * by default Strings are immutable.
         * 
         * In Heap, we have a special area allocated for String call Sting Constant pool.
         * once a pool has a value, it will reassign it to as many variable which use the same string.
         * 
        */
        
        String name = "Jackie";
        name = name + " Chan"; //Here a new object in heap is creatd as the name is now modified. Original name i.e. "Jackie" is now ready for garbage collection
        System.out.println(name);

        String s1 = "Bond";
        String s2 = "Bond";

        System.out.println("Is S1 and S2 same?: "+(s1==s2));

        /*
         * To Implement immutable string we need to work with StringBuffer or StringBuilder
         */

    }
}
