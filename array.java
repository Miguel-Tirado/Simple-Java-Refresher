import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        String[] newArr = new String[5];
        newArr[0] = "hello";
        newArr[1] = "hi";
        newArr[2] = "tim";
        newArr[3] = "bill";
        newArr[4] = "joe";
        //{"hello", "hi", "tim", "bill", "joe"}
        String x = newArr[4];
        System.out.println(x);

        int[] nums = {2,3,54,6,6};
        int y = nums[4];
        System.out.println(y);
    }
}