import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class maps {
    public static void main(String[] args) {
        //Map is a key value pair, similar to an array but we index by keys
        //keys can be almost any data type, also HashMap does not retain an order
        //We cant have two of the same keys but we can have 2 of the same values 
        //Hashmaps are really fast becuase it doesnt keep track of order
        //keys are in the left hand side in m.put(key,value) while value is in the right 
        Map m = new HashMap();
        m.put("Tim",5);
        m.put("joe","x");
        m.put(11,999);
        //this will overwrite the prevous mput
        m.put(11,998);
        //map method that we can use
        m.containsValue(998);
        m.containsKey(11);
        m.get(5); // key at 5 doesnt exist so its null
        //m.clear();
        m.isEmpty();
        //------------------------------------------------------
        //The datatypes for a tree map have to be the same since they will be in order 
        Map n = new TreeMap();
        n.put("tim",5);
        n.put("joe","x");
        n.put("a","b");
        //---------------------------------------------------------------------------------
        //keeps the same order of things you add, FIFO
        Map v = new LinkedHashMap();
        v.put("tim",5);
        v.put("joe","x");
        v.put("a","b");

        System.out.println("HashMap output:");
        System.out.println(m);
        System.out.println("Now will print all the values:" + m.values());// Note there is no order here in they way they print
        System.out.println("TreeMap output:");
        System.out.println(n);
        System.out.println("LinkedHashMap output:");
        System.out.println(v);
    }
}