import java.util.Scanner;
import java.util.Arrays;
public class reversearray {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=n-1; i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
