import java.util.Scanner;
public class exFor {
    public static void main(String[] args){

        int[] arr = {1,5,7,3,4,5};
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i] == 5) {
                System.out.println("found a 5! at index: " + i);
            }
        }

        //For each loop
        int count = 0;
        for(int element:arr) {
            System.out.println(element + " " + count);
            count++;
        }

        for (int i = 0; i < names.length; i++) {
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }

        // Be aware that using break to much is a bad practice 
        for(String n:names) {
            System.out.println(n);
            if(n.equals("tim")) {
                break;
            }
        }




        
    }
}