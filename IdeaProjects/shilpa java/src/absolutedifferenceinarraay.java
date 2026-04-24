import java.util.Scanner;
import java.util.Arrays;
public class absolutedifferenceinarraay {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<n-1 ; i++){
           sum += Math.abs(arr[i] -arr[i+1]);
        }
        System.out.println(sum);
    }

}
