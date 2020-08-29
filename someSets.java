import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class someSets {
    public static void main(String[] args) {
        //set is like a bubble that can only contain unique elements 
        Set<Integer> t = new TreeSet<Integer>();
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-8);
        //t.remove(9);
        //t.clear();
        //t.isEmpty();


        //boolean x = t.contains(t);
        //int y = t.size();
        System.out.println(t);
    }
}