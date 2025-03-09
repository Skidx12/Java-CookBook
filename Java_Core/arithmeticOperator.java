public class arithmeticOperator {
    public static void main(String[] args) {
        
        int add = 7+5;
        int sub = 7-5;
        int mult = 7*5;
        int div = 7/5;
        int mod = 7%5;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(mod);

        //single operand operators
        int num1 = 7;
        // increment
        System.out.println("increment");
        System.out.println(num1++); //post - fetch the val of num and then increment
        System.out.println(++num1); //pre - increment and then fetch value;
        // decrement
        System.out.println("decrement");
        System.out.println(num1--); //post - fetch the val of num and then decrement
        System.out.println(--num1); //pre - decrement and then fetch value;
    }
}
