import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        /* An array list is like an array but is dynamic so the size can change
        However the list is much slower than a array, also had identical properties
        to a set */
        ArrayList<Integer> t = new ArrayList<Integer>();
        //LinkedList<Integer> t = new LinkedList<Integer>();
        t.add(1);
        t.add(2);
        t.add(1);
        t.add(2);
        t.add(1);
        t.add(2);
        t.get(0);
        t.set(1, 5);
        //t.size();
        t.subList(1,3);

        System.out.println(t.subList(1,4));
    }
}