public class logicalOperators {
    public static void main(String[] args) {
        /*logical operators are used to combine multiple relational operators
        for example
        x<y AND/OR x==y

        AND -> 
        T T = T;
        T F = F;
        F T = F;
        F F = F;

        OR->
        T T = T;
        T F = T;
        F T = T;
        F F = F;

        NOT ->
        T -> F
        F -> T

        */
    
        int x = 5;
        int y = 4;
        int a = 2;
        int b = 9;
        // AND
        System.out.println("AND");
        boolean i = x<y && a>b;
        boolean j = x>y && a<b;
        System.out.println(i);
        System.out.println(j);
        
        // OR
        System.out.println("OR");
        boolean k = x<y || a>b;
        boolean l = x>y || a<=b;
        System.out.println(k);
        System.out.println(l);
        
        // NOT
        System.out.println("NOT");
        boolean result = a<b;
        boolean result1 = !(a<b);
        System.out.println(result);
        System.out.println(result1);


    }
}
