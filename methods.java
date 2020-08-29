import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        //sc.nect();
        int x = 5;
        //Here we a creating a variable with an isntance of a string
        String h = "hello";
        h.length();
        tim("Timmmm", 4);
        System.out.println(add2(6));
        System.out.println(str("hi"));
        int dog1 = 4;
        int dog2 = 5;

    }

    public static void tim(String str, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        } 
    }

    public static int add2(int x) {
        return x + 2;
    }

    public static String str(String x) {
        return x + "!";
    }

}