public class ScientificCalculator extends MoreCalculator{
    public int power(int a, int b){
        return (int)Math.pow(a, b); //Math.pow returns a double type, So converting it to lower type bcse our return type is integer.
    }
}
