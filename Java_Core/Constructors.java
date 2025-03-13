/*
 * Constructors are the special Methods of a class which are called by default at the time of Object Creation. These methods are having identity 
 * similar to an instance method, but there are some restrictions:
 * - Constructors are COMPULSORILY name as the Class Name.
 * - Constructors do NOT have any Return Type.
 * - Constructors will have access modifiers.
 * - COnstructors are called eveytime a class object is created.
 * 
 * Most use case of a Constructor is to Set default values for an object. below is an example.
 */

class Clock{
    private int hourFormat;
    private String type;

    public Clock() {
        hourFormat = 24;
        type = "Analog";
    }

    public int getHourFormat(){
        return hourFormat;
    }
    public String getType(){
        return type;
    }

    public void setHourFormat(int hf){
        this.hourFormat = hf;
    }
    public void setType(String type){
        this.type = type; //Essential use case of This keyword. to differentiate between instance and local variable. At the time of execution, if not specified, Compiler will prefer local over instace variable.
    }

}

public class Constructors {
    public static void main(String[] args) {
        Clock clk = new Clock();
        System.out.println("Before initializing object values manually: ");   
        System.out.println("type: "+clk.getType()+" format: "+clk.getHourFormat());

        clk.setType("Digital");
        clk.setHourFormat(12);
        System.out.println("After... ");
        System.out.println("Type: "+clk.getType()+" format: "+clk.getHourFormat());
    } 
    
}
