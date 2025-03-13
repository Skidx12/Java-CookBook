/*
 * Imagine if we have 100 files. It's okay to put them in one folder, but it's always better if you can create a structure
 * where you can have few files in one folder and few files in another folder. And then you can have a folder inside a folder.
 * Now, normally this type of pattern in Java is called packages.
 * 
 * To do that we need to provide a package at the top of the class.
 * 
 * By creating a package, you restrict the access of the files inside a package to external libraries or programs. This helps in data privacy
 * and better file management.
 * 
 * Need for Packages?
 * When you create a project, a big project, normally you deploy your project on the server somewhere, right?
 * And maybe you're creating a library.
 * What you do is when you create a project it's not always for your use. Sometime you create libraries so that others can use your files.
 * Now, in this case as well you will create a package, and then you will give your package to others. 
 * The only thing is when you are sharing your package to the entire world it should be unique,it should have a unique name.
 * 
 * 
 */


// We write the import keyword to inject the mentioned package(library) in our project/class and use it's functionalities.
// to import multiple classes we can use this method
// import packageExample.example2;
// import packageExample.exampleClass;

// or to import complete package and its all classes, we can use :
import packageExample.*;
// importing specific class from a different package when needed
import java.util.ArrayList;

public class Packages {
    public static void main(String[] args) {
        example2 example = new example2(); //Now we are easily able to access this class
        example.display(); //inherited method of example2 from exampleClass class.
        example.display2(); 
        
        ArrayList arrList = new ArrayList<Integer>(); //Just for example
    }
    
}
