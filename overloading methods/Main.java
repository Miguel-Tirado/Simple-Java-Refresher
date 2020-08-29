public class Main {
    public static void main(String[] args) {
        student joe = new student("joe");
        student bill = new student("bill");
        student tim = new student("tim");

        //note this is comparing the objects bob and billy not there names 
        //the compareTo tells how far away bother names are to each other in terms of there 
        //characters
        System.out.println(joe.equals(bill));
        System.out.println(joe.compareTo(tim) < 0);
        //note this is printing the memory location of the tim object
        // if we did not have a toString method in student class
        System.out.println(tim);

        OuterClass out = new OuterClass();
        OuterClass.InnerClass in = out.new InnerClass();
        in.display();
        //out.inner();
    }
}