/*
 * Object class is a built in class in Java, similar to Class class.
 * Object class implements two methods namely - toString() and equals() which we use on multiple occasions.
 * 
 * ----------------------------------
 * toString() - This method is convert the whole object into a string. 
 * We got a toString method which returns a string. What it returns? It returns the class name. 
 * If you can see it says getClass. getClass method will give you the class name. Then it calls getName. 
 * So class name, and then we got @ that in between. Then it print something in hexa string. 
 * But what exactly represents?  It converts the number into hexadecimal string and that number is actually hashCode. 
 * It tries to create a single string of all the data which you have. So let's say if you have a object which has five variables, 
 * it will apply a hash algorithm and it will generate a string, a number string, which will be a fixed size.
 * 
 * -----------------------------
 * equals() - This method is used to compare two object. Preferable to get the comparison value between two different object of the same class.
 * It basically compares the two object by their hexadecimal number.
 * But there are some rules in Java if you are trying to do equals. When you say two objects are equal, of course they should have a same value and they should also have a same hashCode.
 * You can use your ID and you can say source action and you can see it gives you an option of generate hashCode and equals.  Click on that. Select all the variables which you want to compare and click on okay.
 * It will generate the equals method for you. And you can see it does multiple checks. We have only checks for the value. But what if you want to check if the object is not null?
 * Maybe you want to check for the class name as well. Maybe you want to check if the model is not null before comparing. So it does multiple checks for you. And it also implements hashCode. You know, this is how the hash code is generated.
 * Basically it takes your data and works and applies some algorithm on your data to generate the result. If this algorithm can change, you can implement your own algorithm.
 * But of course it should have all the variables which should comes into play.
 * 
 * We can generate these two methods automatically using some in built ways provided in some IDEs like Eclipse or IntelliJ
 */

 class Laptop{
    int price;
    String brand;

    // Overriding Object class .toString() method to print my string
    public String toString(){
        return brand + " : "+ price;
    }

    // Overriding Object class .equals() method to compare the objects as per my requirements.
    public boolean equals(Laptop laptop){
        if(this.brand.equals(laptop.brand) && this.price == laptop.price){
            return true;
        }else{
            return false;
        }
    }

 }
public class ObjectClassEqualsToString{
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.brand = "Acer";
        obj.price = 234;

        // toString()

        // uncomment below and comment Laptop class toString() method to undestand
        // System.out.println(obj); //Ouput will be like - classname@hexString. Read comments above to understnd what it means.
        // System.out.println(obj.toString()); //by default object has this method which is called automatically as above.

        // my toString() method;
        System.out.println(obj.toString());

        //equals() 

        Laptop obj1 = new Laptop();
        obj1.brand = "Acer";
        obj1.price = 234;
        
        System.out.println( obj1 == obj); //guess the output
        System.out.println(obj1.equals(obj)); // this statement actually compares the Hex values of both the objects
        // 

    }
}