import java.util.Scanner;
import java.util.Arrays;
public class equilibriumarray {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int totalsum=0;
        for (int i = 0; i < n; i++) {
            totalsum+= arr[i];
        }
        int leftsum=0;
        for(int i=0; i<n;i++){

            int rightsum= totalsum-leftsum-arr[i];
            if(leftsum==rightsum){
                System.out.println(i+"equlibrium index");
                break;
            }
            leftsum+= arr[i];
        }
    }
}
