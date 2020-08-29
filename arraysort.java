import java.util.Arrays;
public class arraysort {
    public static void main(String[] args) {
        int[] x = {-99,5,6,3,2,1,7,8,0};
        Arrays.sort(x,1,7);
        Arrays.sort(x); // sort the whole array 
        for(int i:x) {
            System.out.print(i + ",");
        }
    }
}