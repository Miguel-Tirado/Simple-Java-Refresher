import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("tim")) {
            System.out.println("You typed tim");
        } else if (s.equals("hello")) {
            System.out.println("hi");
        } else {
            System.out.println("Print");
        }
        //note that else is not needed at the end
        
    }
}