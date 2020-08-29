//Cat is a subclass of Dog, Dog is a super class
//Dog class methods and variable have been passed to cat.
public class Cat extends Dog {
    //super referes to the Dog class
    private int food;

    //Constructor method here
    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    public Cat(String name, int age) {
        super(name, age);
        this.food = 50;
    }

    public Cat(String name) {
        super(name, 0);
        this.food = 50;
        //0 is used here to just hard code it in here
    }

    public void speek() {
        System.out.println("Meow my name is " + this.name + " and i get fed " + this.food);
    }
    public void eat(int x) {
        this.food -= x;
    }
    
}