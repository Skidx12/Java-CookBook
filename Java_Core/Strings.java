public class Strings {
    public static void main(String[] args) {
        /*
        Strings are always represented within "". 
        it is a combination of multiple characters. 
        String is a class and not a primitive data type.
        String takes memory from Heap as it is a class. String variable is a reference variable which points to the address of actual heap memory location.
        */

        // Approaches to initialize a String. All are valid.
        String name = "Test"; //Object creation is automatic here
        String name2 = new String("Jackie chan"); //manual object creation
        System.out.println(name);
        System.out.println(name2);

        // hashcode
        System.out.println(name2.hashCode());

        // concatenation
        System.out.println(name+" "+name2+" has hashcode: "+name2.hashCode());

    }
}
