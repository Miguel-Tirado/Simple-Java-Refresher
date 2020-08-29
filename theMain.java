public class theMain {
    public static void main(String[] args) {
        Dog tim = new Dog("tim", 4);
        //tim.speek();
        Dog bill = new Dog("bill", 7);
        //bill.speek();
        Dog bob = new Dog("bob", 11);
       // bob.speek();
        
        tim.setAge(10);
        //tim.speek();

        Cat tom = new Cat("tom", 18, 100);
        tom.speek();
        Cat bim = new Cat("bim", 7);
        bim.speek();
        Cat joe = new Cat("joe");
        joe.speek();

        //System.out.println(x);
    }
}