public class source {
    public static void main(String[] args) {
        Dog tim = new Dog("tim", 9);//We are creating an instance of the dog class named tim
        Dog bill = new Dog("bill", 10);//We are creatomg an intance of the dog class named bill
        //Notice that this will print out 2 becuase there are two instances of the Dog class 
        //which cause Dog.count to iterate 2 times therefore being 2. If we comment out of the 
        //instance of Dog above the count will print out one.
        Dog.count = 7;
        System.out.println(Dog.count);
    }
}