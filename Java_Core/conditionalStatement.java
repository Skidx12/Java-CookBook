public class conditionalStatement {
    public static void main(String[] args) {
        //Conditional statements helps make decisions

        //if
        //if-else
        //nested if-else
        //switch statements
        //ternary operator
        int n = 24;
        int result = 0;

        /*
            if(n>5)
                System.out.println(result+10);
            else
                System.out.println(result+20);
        */
        result = n>5?result+10:result+20;
        System.out.println(result);

    }
}
