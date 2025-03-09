public class typeConversionAndCasting {
    public static void main(String[] args) {
        
        // implicit
        System.out.println("implicit--");
        byte by = 126;
        int in = 1234;
        in = by;
        System.out.println(in);
        
        // explicit
        System.out.println("Explicit--");
        byte b = 127;
        int a = 12;
        
        // b=a; //this will error out as it's not possible to go downward casting
        b = (byte) a; //this will work here
        System.out.println(b);
        
        // Type promotion
        System.out.println("Explicit--");
        
        byte b1= 10;
        byte b2 = 30;

        int i = b1*b2; //Automatic promotion as byte range is exceeded
        System.out.println(i);
    }
}
