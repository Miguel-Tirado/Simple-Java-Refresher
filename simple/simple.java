public class simple {
    public static void main(String[] args) {
        System.out.println("Hello there, how are you.");
        
        
        Level lvl = Level.LOW;
        //String en = lvl.toString();
        //Level[] arr = Level.values(); 
    

        /*
        for(Level e : arr) {
            System.out.println(e);
        }
        //System.out.println(Level.values());

        if(lvl == Level.LOW) {
            System.out.println(lvl);
        } else if(lvl == Level.MEDIUM) {
            System.out.println(lvl);
        } else {
            System.out.println(lvl);
        } */

        lvl.setlvl(5);
        
        System.out.println(lvl.getlvl());

    }
}