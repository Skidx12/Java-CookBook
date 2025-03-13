package packageExample;

// Here we are able to access ExampleClass easily beacause it is inside the same package.
public class example2 extends exampleClass{
    public void display2(){
        System.out.println("this is example2");
        // Packages pkg = new Packages(); //This line will give error, because packages class is outside the same package.
    }
}
