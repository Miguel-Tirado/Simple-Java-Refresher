import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        System.out.print("Input your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if(age >= 18) {
            System.out.println("Input your fav food: ");
            String food = sc.nextLine();

            if(food.equals("pizza")) {
                System.out.println("Mine Too");
            } else {
                System.out.println("Not Mine");
            }
            
        } else if( age >= 13) {
            System.out.println("You are a teenager!");

        } else {
            System.out.println("You are not a teenager or an adult");
        }

    }
}