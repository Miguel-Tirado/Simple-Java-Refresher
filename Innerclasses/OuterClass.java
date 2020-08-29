public class OuterClass {


    public void inner() {
        //Note no public keyword needed here becuase its inside a public method already
        class InnerClass {
            public void display() {
                System.out.println("Inner Class");
            }
        }

        //Note this will not were outside the inner method becuase this class is defined inside the method 
        InnerClass in = new InnerClass();
        in.display();
    }
}