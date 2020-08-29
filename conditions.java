import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        //case sensitive
        int x = 6;
        int y = 23;
        int z = 10;
        //Comparitors > < == >= <= != S
        //conditions && AND || OR ! NOT 
        boolean compare = !(x > y || z < y);
        System.out.println(compare);
    }
}