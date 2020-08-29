public class Dog {
    //Class variable that is protected
    /*Static is a keyword used to describe how objects are maneged in memory
    This mean the static object belongs specifically to the class, instead of 
    instances of that class.(variables, methods, classes) can be static */
    protected static int count = 0;
    protected String name;
    protected int age;

    //Constructor for dog 
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        Dog.count += 1;
        Dog.display();
        this.display2(); //calling the method on the instance 
    }
    
    public void display2() {
        System.out.println("I am a dog!");
    }

    //static method only used when we dont care about the instance and 
    //we just want to do something
    public static void display() {
        System.out.println("I am a dog!");
        
    }
}