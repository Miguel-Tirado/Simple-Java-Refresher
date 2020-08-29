import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scanned1 = sc.next();
        //int x = Integer.parseInt(scanned1);
        //double scanned2 = sc.nextDouble();
        //int scanned3 = sc.nextInt();
        boolean ans = scanned1.equals("hello");
        System.out.println(ans);
    }
}