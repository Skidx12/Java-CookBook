class Calculate{
    public int add(int a, int b){
        System.out.println("inside add");
        return a+b;
    }
}


public class classesAndObjects {

    public static void main(String[] args) {
        int num1 =5;
        int num2 =4;

        Calculate calc = new Calculate();
        
        System.out.println("from Calculate: "+calc.add(num1, num2));
        int result = num1+num2;
        System.out.println(result);
    }
}
