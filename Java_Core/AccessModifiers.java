import packageExample.Student;
/*
 * Access Modifiers are the keywords which define the Access to classes, methods or variables across the programs.
 * 
 */
public class AccessModifiers {
    public static void main(String[] args) {
        Student obj = new Student(); //We are able to access as we have already imported from package.
        // System.out.println(obj.age); //By default this is due to the access modifier is Default
        //We are getting an error stating "The field Student.age is not visible". Reason: it is not public to the package in which we are working right now
        // System.out.println(obj.age);  //Age is not visible as it is protected. 
        
        
        // Creating OldStudent.java to test this above statement in same package with same process as above.
        OldStudent obj2 = new OldStudent();
        System.out.println(obj2.myage); //We are able to get this printed !!!!
        // This is possible because OldStudent is in the same package and by default accessible to other classes in same package.
        // Now if you want something to be accessed outside the package, always make it public.
        
        // To Access the Protected value from Student class, we can inherit the Student class to OldStudent and call showAgeStudent from there.
        obj2.showAgeStudent();
    }
}

/*
 * --------------- Conclusion ---------------- 
 * Default(no access modifier specified) - It can be accessed in the same package, not outside. Also known as Private Protected. 
 * Public - Can be access across packages (basically anywhere)
 * Private - Private is accessible to the same class only.
 * Protected - can be used in same package freely, but only in subclasses of other packages.
 * 
 */