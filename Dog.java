//a class a data type thats a blue print to what we need 
public class Dog {
    //private keyword keeps these variables local to just this class file
    protected String name;
    protected int age;
    //only use private variables and method if its only restricted to that file 
    
    //constructor method
    //A constructor method is needed in order to have acess to name and age 
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        add2();
        //note that "this" keyword gets the private variables on top
        //so this.name refers to the private name variables above
    }

    public void speek() {
        System.out.println("I am " + this.name + " and i am " + this.age + " years old");
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int a) {
        this.age = a;
    }
    private int add2() {
        return this.age + 2;
    }
}