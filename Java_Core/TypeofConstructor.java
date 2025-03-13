/*
 * Now there are different type of Constructors: Default Constructor, Parameterized Constructor
 * Similar to Methods, we can implement Constructor Overloading. 
 * 
 * We can create different types of Constructors for a class with multiple parameters.
 * This facilitates assigning the default values for a particular object beforeHand and not call any extra function for this.
 * we can set values for specific variables depending on the parameters set for the constructors. 
 */


 class Clock{
    private int hourFormat;
    private String type;
    private String brand;

    // This is a Default Constructor.
    public Clock() {
        hourFormat = 24;
        type = "Analog";
    }

    // This is a parameterised Constructor.
    public Clock(int hourFormat, String brand){
        this.hourFormat = hourFormat;
        this.brand = brand;
    }

    public int getHourFormat(){
        return hourFormat;
    }
    public String getType(){
        return type;
    }
    public String getBrand(){
        return brand;
    }

    public void setHourFormat(int hf){
        this.hourFormat = hf;
    }
    public void setType(String type){
        this.type = type; //Essential use case of This keyword. to differentiate between instance and local variable. At the time of execution, if not specified, Compiler will prefer local over instace variable.
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

}

public class TypeofConstructor {
    public static void main(String[] args) {
        Clock clk = new Clock();
        System.out.println("Calling Default Constructor");   
        System.out.println("type: "+clk.getType()+" format: "+clk.getHourFormat()+" AND BRAND: "+clk.getBrand());
        System.out.println("--------------");
        Clock clk1 = new Clock(12, "Sonata");
        System.out.println("Calling Parameterized Constructor");   
        System.out.println("type: "+clk1.getType()+" format: "+clk1.getHourFormat()+" AND BRAND: "+clk1.getBrand());
        
    }
    
}
