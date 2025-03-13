/*
 * Encapsulation : 
 * Now by word, what Encapsulation means?
 * We have the concept of capsules where we have medicine powder there.
 * So basically we can imagine capsule as something which is keeping it closed, keeping it tight,
 * and no one from the outside world can use it or know the composition of the chemicals directly.
 * 
 * This concept of hiding the internal actualities and functionalities from external world (classes and objects) is called Encapsulation.
 * 
 * How to achieve Encapsulation?
 * there are two combination of ways : 
 * 1. Private Access Modifier - this particular variable, is STRICTLY accessible only in the same class.
 * 2. Getters and Setters - public methods to fetch the values of those Private variables
 */

class Computer{
    
    // We are declaring variables a private to restrict the access to these variables from external classes and methods.
    private String brand;
    private float price;

    // Creating Getter methods to access the variables.
    public String getBrand(){
        return brand;
    } 

    public float getPrice(){
        return price;
    }

    // Creating Setter methods to assign values. 
    // Set methods are not really compulsory but are important as per coding standards and data security.
    public void setBrand(String brandName){
        this.brand = brandName;
    }
    public void setPrice(float cost){
        this.price = cost;
    }
    

}
public class Encapsulation {
    public static void main(String[] args) {
        // create an instance and assign values to the variables using setter methods to avoid variable direct access.
        Computer comp = new Computer();
        comp.setBrand("HP");
        comp.setPrice(4839.3f);

        /*
         * Why cant we do this like we used to earlier? like use objects and their variables? 
         * 
         * Reason: the variables do not belong to Encapsulation class, but Computer class. 
         * And these variables are Private in nature, meaning,
         * it is only accessible to Computer class and it's variables.
         */
        // comp.brand = "Apple";
        // comp.price = 1231.34f;

        // Accessing the values using getter methods
        System.out.println("Brand: "+comp.getBrand()+", Price: "+comp.getPrice());
    }
}
